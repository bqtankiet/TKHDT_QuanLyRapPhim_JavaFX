package controllers;

import static models.enums.LoaiKhachHang.ADULT;
import static models.enums.LoaiKhachHang.CHILDREN;
import static models.enums.LoaiKhachHang.MEMBER;
import static models.enums.LoaiKhachHang.STUDENT;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import storage.StorageGiaVe;

public class GiaVeController implements Initializable{
	public static final String FXML = "/views/giave/giave.fxml";

    @FXML
    private TextField hssv_cuoituan;

    @FXML
    private TextField hssv_ngaythuong;

    @FXML
    private TextField nguoilon_cuoituan;

    @FXML
    private TextField nguoilon_ngaythuong;

    @FXML
    private TextField phuthu3D;

    @FXML
    private TextField phuthu4D;

    @FXML
    private TextField phuthuCOUPLE;

    @FXML
    private TextField phuthuIMAX;

    @FXML
    private TextField phuthuVIP;

    @FXML
    private AnchorPane rootPane;

    @FXML
    private TextField thanhvien_ngaythuong;

    @FXML
    private TextField thanvien_cuoituan;

    @FXML
    private Button themSuatChieuBtn;

    @FXML
    private TextField treem_cuoituan;

    @FXML
    private TextField treem_ngaythuong;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		initGiaVe();
		initGiaPhuThu();
	}

	private void initGiaPhuThu() {
		
	}

	private void initGiaVe() {
		// hssv
		int hssv_ngaythuong = StorageGiaVe.data.get(STUDENT).getGiaVeNgayThuong();
		int hssv_cuoituan = StorageGiaVe.data.get(STUDENT).getGiaVeCuoiTuan();
		this.hssv_ngaythuong.setText(hssv_ngaythuong+"");
		this.hssv_cuoituan.setText(hssv_cuoituan+"");
		
		// nguoilon
		int nguoilon_ngaythuong = StorageGiaVe.data.get(ADULT).getGiaVeNgayThuong();
		int nguoilon_cuoituan = StorageGiaVe.data.get(ADULT).getGiaVeCuoiTuan();
		this.nguoilon_ngaythuong.setText(nguoilon_ngaythuong+"");
		this.nguoilon_cuoituan.setText(nguoilon_cuoituan+"");
		
		// treem
		int treem_ngaythuong = StorageGiaVe.data.get(CHILDREN).getGiaVeNgayThuong();
		int treem_cuoituan = StorageGiaVe.data.get(CHILDREN).getGiaVeCuoiTuan();
		this.treem_ngaythuong.setText(treem_ngaythuong+"");
		this.treem_cuoituan.setText(treem_cuoituan+"");
		
		// thanhvien
		int thanhvien_ngaythuong = StorageGiaVe.data.get(MEMBER).getGiaVeNgayThuong();
		int thanhvien_cuoituan = StorageGiaVe.data.get(MEMBER).getGiaVeNgayThuong();
		this.thanhvien_ngaythuong.setText(thanhvien_ngaythuong+"");
		this.thanvien_cuoituan.setText(thanhvien_cuoituan+"");
	}

}
