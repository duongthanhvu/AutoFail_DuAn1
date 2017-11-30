/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.ThongBao;
import java.util.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

/**
 *
 * @author vudtpk0074
 */
public class XuLyHoaDon {
    private InvoiceDetail[] item;
    private InvoiceInfo info;

    public XuLyHoaDon() {
        this.item = new InvoiceDetail[2];
        item[0] = new InvoiceDetail("Smarta IQ 3", 319000, 1, 319000, 0.2);
        item[1] = new InvoiceDetail("Metacare 5 Olive", 100000, 1, 100000, 0.2);
        this.info = new InvoiceInfo("Dương Thành Vũ", "Nguyễn Phú Thứ", "26-11-2017", 419000);
    }

    public XuLyHoaDon(InvoiceDetail[] item, InvoiceInfo info) {
        this.item = item;
        this.info = info;
    }
    
    public ThongBao xuatHoaDon() {
        try {
            String outputFile = "./data/hoa_don/HoaDon-"+LocalDateTime.now().format(DateTimeFormatter.ofPattern("uuuuMMdd-HHmmss"))+".pdf";

            /* List to hold Items */
            List<InvoiceDetail> listItems = new ArrayList<InvoiceDetail>();
            List<InvoiceInfo> itemInfo = new ArrayList<InvoiceInfo>();
            /* Create Items */

            /* Add Items to List */
            for (int i = 0; i < item.length; i++) {
                listItems.add(item[i]);
            }
            itemInfo.add(info);

            /* Convert List to JRBeanCollectionDataSource */
            JRBeanCollectionDataSource itemsJRBean = new JRBeanCollectionDataSource(listItems);
            JRBeanCollectionDataSource infoJRBean = new JRBeanCollectionDataSource(itemInfo);
            /* Map to hold Jasper report Parameters */
            Map<String, Object> parameters = new HashMap<String, Object>();
            parameters.put("ItemDataSource", itemsJRBean);
            parameters.put("InfoDataSource", infoJRBean);
            parameters.put("tenKH", info.getTenKH());
            parameters.put("tenNV", info.getTenNV());
            parameters.put("ngayTao", info.getNgayTao());
            parameters.put("tongTien", info.getTongTien());
            /* Using compiled version(.jasper) of Jasper report to generate PDF */
            //JasperReport jasperReport = JasperCompileManager.compileReport("src/assignment/sof203/PDF/template.jrxml");
            InputStream input = new FileInputStream("./data/template.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(input, parameters, new JREmptyDataSource());
            input.close();
            /* outputStream to create PDF */
            OutputStream outputStream = new FileOutputStream(new File(outputFile));
            /* Write content to PDF file */
            JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);
            outputStream.close();
            System.out.println("File Generated");
            return new ThongBao("Đã xuất hóa đơn", ThongBao.THANH_CONG);
        } catch (JRException | IOException ex) {
            return new ThongBao("Lỗi " + ex, ThongBao.LOI);
        }
    }
}
