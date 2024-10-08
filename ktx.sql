-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 05, 2024 at 08:20 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ktx`
--

-- --------------------------------------------------------

--
-- Table structure for table `dichvu`
--

CREATE TABLE `dichvu` (
  `MaDV` varchar(10) NOT NULL,
  `TenDV` varchar(100) DEFAULT NULL,
  `DonGia` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `dichvu`
--

INSERT INTO `dichvu` (`MaDV`, `TenDV`, `DonGia`) VALUES
('001', 'Giặt là ', 10000.00),
('002', 'Gửi xe', 30000.00),
('003', 'Cơm trưa', 200000.00);

-- --------------------------------------------------------

--
-- Table structure for table `guixe`
--

CREATE TABLE `guixe` (
  `Id` int(11) NOT NULL,
  `BienSoXe` varchar(20) NOT NULL,
  `ThoiGianLayXe` datetime DEFAULT NULL,
  `ThoiGianGuiXe` datetime DEFAULT NULL,
  `SoLanLayGui` int(11) DEFAULT 0,
  `SoTienPhaiTra` decimal(10,2) DEFAULT 0.00
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `khachthamquan`
--

CREATE TABLE `khachthamquan` (
  `ID` int(11) NOT NULL,
  `SoCMT` varchar(12) DEFAULT NULL,
  `TenKhach` varchar(100) DEFAULT NULL,
  `NgaySinh` date DEFAULT NULL,
  `MaSV` varchar(10) DEFAULT NULL,
  `NgayTham` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `khachthamquan`
--

INSERT INTO `khachthamquan` (`ID`, `SoCMT`, `TenKhach`, `NgaySinh`, `MaSV`, `NgayTham`) VALUES
(2, '12341231', '123123123', '2024-10-09', '17020583', '2024-10-23'),
(5, '12341231222', '123122223123', '2024-10-09', '17020583', '2024-10-23'),
(8, '12341231222', '123122223123', '2024-10-09', '17020583', '2024-11-23'),
(9, '12341231222', '123122223123', '2024-10-09', '17020583', '2024-12-23'),
(10, '123123ssasa', '12213213123', '2024-10-09', '17020583', '2024-10-09'),
(11, '123123ssasa', '12213213123', '2024-10-09', '17020583', '2024-10-19'),
(12, '037199000040', 'Khách 1', '1999-09-30', '17020583', '2024-09-25'),
(13, '123123ssasa', '12213213123', '2024-10-09', '17020583', '2024-10-29');

-- --------------------------------------------------------

--
-- Table structure for table `phong`
--

CREATE TABLE `phong` (
  `SoPhong` varchar(10) NOT NULL,
  `LoaiPhong` varchar(50) DEFAULT NULL,
  `DonGia` decimal(10,2) DEFAULT NULL,
  `SoNguoiToiDa` int(11) DEFAULT 0,
  `SoNguoiHienTai` int(11) DEFAULT 0
) ;

--
-- Dumping data for table `phong`
--

INSERT INTO `phong` (`SoPhong`, `LoaiPhong`, `DonGia`, `SoNguoiToiDa`, `SoNguoiHienTai`) VALUES
('105', 'VIP', 120000.00, 12, 8),
('106', 'VIP', 10000.00, 2, 2),
('123', 'VIP', 120000.00, 12, 2);

--
-- Triggers `phong`
--
DELIMITER $$
CREATE TRIGGER `check_so_nguoi_before_insert` BEFORE INSERT ON `phong` FOR EACH ROW BEGIN
  IF NEW.SoNguoiHienTai > NEW.SoNguoiToiDa THEN
    SIGNAL SQLSTATE '45000'
    SET MESSAGE_TEXT = 'Số người hiện tại không được vượt quá số người tối đa';
  END IF;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `check_so_nguoi_before_update` BEFORE UPDATE ON `phong` FOR EACH ROW BEGIN
  IF NEW.SoNguoiHienTai > NEW.SoNguoiToiDa THEN
    SIGNAL SQLSTATE '45000'
    SET MESSAGE_TEXT = 'Số người hiện tại không được vượt quá số người tối đa';
  END IF;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `sinhvien`
--

CREATE TABLE `sinhvien` (
  `MaSV` varchar(10) NOT NULL,
  `SoCMT` varchar(12) DEFAULT NULL,
  `NgaySinh` date DEFAULT NULL,
  `Lop` varchar(10) DEFAULT NULL,
  `QueQuan` varchar(100) DEFAULT NULL,
  `SoPhong` varchar(10) DEFAULT NULL,
  `NgayVaoO` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `sinhvien`
--

INSERT INTO `sinhvien` (`MaSV`, `SoCMT`, `NgaySinh`, `Lop`, `QueQuan`, `SoPhong`, `NgayVaoO`) VALUES
('1', '1', '2000-10-09', '9A', '123', '105', '2000-10-02'),
('17020183', '', '1999-09-30', '', '', '105', '2024-09-30'),
('17020583', '76979', '1999-09-30', '', 'Ninh Binh', '123', '2024-09-29'),
('17020683', '214214', '1999-09-30', '2A', 'Ninh Binh', '105', '2024-09-30'),
('21424', '124214', '1990-09-30', '2A', '2424', '106', '2024-09-30'),
('gcbcfgh', '325235', '2024-09-30', '2A', '2424', '106', '2024-09-30');

--
-- Triggers `sinhvien`
--
DELIMITER $$
CREATE TRIGGER `after_sinhvien_delete` AFTER DELETE ON `sinhvien` FOR EACH ROW UPDATE Phong SET SoNguoiHienTai = SoNguoiHienTai - 1
WHERE SoPhong = OLD.SoPhong
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `after_sinhvien_insert` AFTER INSERT ON `sinhvien` FOR EACH ROW UPDATE Phong SET SoNguoiHienTai = SoNguoiHienTai + 1
WHERE SoPhong = NEW.SoPhong
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `sudungdichvu`
--

CREATE TABLE `sudungdichvu` (
  `ID` int(11) NOT NULL,
  `MaSV` varchar(10) DEFAULT NULL,
  `MaDV` varchar(10) DEFAULT NULL,
  `NgaySuDung` date DEFAULT NULL,
  `SoLanSuDung` int(11) DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `sudungdichvu`
--

INSERT INTO `sudungdichvu` (`ID`, `MaSV`, `MaDV`, `NgaySuDung`, `SoLanSuDung`) VALUES
(4, '17020583', '001', '2024-10-30', 2),
(5, '17020583', '002', '2024-10-10', 1),
(6, '17020183', '001', '2024-10-10', 1),
(7, '17020583', '001', '2024-10-11', 1);

-- --------------------------------------------------------

--
-- Table structure for table `xedangky`
--

CREATE TABLE `xedangky` (
  `MaSV` varchar(10) DEFAULT NULL,
  `BienSo` varchar(20) NOT NULL,
  `NgayDangKy` date DEFAULT NULL,
  `LoaiVe` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `xedangky`
--

INSERT INTO `xedangky` (`MaSV`, `BienSo`, `NgayDangKy`, `LoaiVe`) VALUES
('17020183', '212424', '2024-10-10', 'Vé ngày'),
('17020183', '214242421', '2024-09-29', 'Vé tháng'),
('17020583', '242424', '2024-10-10', 'Vé tháng'),
('17020183', '25252524', '2024-09-30', 'Vé tháng');

--
-- Triggers `xedangky`
--
DELIMITER $$
CREATE TRIGGER `check_so_luong_ve_thang` BEFORE INSERT ON `xedangky` FOR EACH ROW BEGIN
    -- Đếm số lượng biển số có loại vé tháng mà sinh viên đã đăng ký
    DECLARE soLuongVeThang INT;

    SELECT COUNT(*) INTO soLuongVeThang
    FROM xedangky
    WHERE MaSV = NEW.MaSV AND LoaiVe = 'Vé tháng';

    -- Kiểm tra nếu đã đăng ký 2 xe vé tháng thì phát tín hiệu lỗi
    IF soLuongVeThang >= 2 AND NEW.LoaiVe = 'Vé tháng' THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Sinh viên chỉ được phép đăng ký tối đa 2 xe có loại vé tháng.',
 		MYSQL_ERRNO = 10000;  
    END IF;
END
$$
DELIMITER ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dichvu`
--
ALTER TABLE `dichvu`
  ADD PRIMARY KEY (`MaDV`);

--
-- Indexes for table `guixe`
--
ALTER TABLE `guixe`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `khachthamquan`
--
ALTER TABLE `khachthamquan`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `MaSV` (`MaSV`);

--
-- Indexes for table `phong`
--
ALTER TABLE `phong`
  ADD PRIMARY KEY (`SoPhong`);

--
-- Indexes for table `sinhvien`
--
ALTER TABLE `sinhvien`
  ADD PRIMARY KEY (`MaSV`),
  ADD KEY `SoPhong` (`SoPhong`);

--
-- Indexes for table `sudungdichvu`
--
ALTER TABLE `sudungdichvu`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `xedangky`
--
ALTER TABLE `xedangky`
  ADD PRIMARY KEY (`BienSo`),
  ADD KEY `MaSV` (`MaSV`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `guixe`
--
ALTER TABLE `guixe`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `khachthamquan`
--
ALTER TABLE `khachthamquan`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `sudungdichvu`
--
ALTER TABLE `sudungdichvu`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `khachthamquan`
--
ALTER TABLE `khachthamquan`
  ADD CONSTRAINT `khachthamquan_ibfk_1` FOREIGN KEY (`MaSV`) REFERENCES `sinhvien` (`MaSV`);

--
-- Constraints for table `sinhvien`
--
ALTER TABLE `sinhvien`
  ADD CONSTRAINT `sinhvien_ibfk_1` FOREIGN KEY (`SoPhong`) REFERENCES `phong` (`SoPhong`);

--
-- Constraints for table `xedangky`
--
ALTER TABLE `xedangky`
  ADD CONSTRAINT `xedangky_ibfk_1` FOREIGN KEY (`MaSV`) REFERENCES `sinhvien` (`MaSV`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
