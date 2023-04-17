package com.mycompany.myapp.domain;

import com.mycompany.myapp.service.dto.ProductDTO;
import org.springframework.web.multipart.MultipartFile;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class FileUploadUtils {

    public void ConvertImage(MultipartFile[] multipartFiles, ProductDTO productDTO) throws IOException {
        for (MultipartFile file : multipartFiles
        ) {
//            BufferedImage image = ImageIO.read(file.getInputStream());
            String uploadDir =  "Product_Image" + productDTO.getId() + "/";
            File uploadDirectory = new File(uploadDir);
            if (!uploadDirectory.exists()) {
                uploadDirectory.mkdir();
            }
            File uploadedFile = new File(uploadDir + file.getOriginalFilename());
            file.transferTo(uploadedFile);
        }
    }

    public void DeleteDirUploadFile(ProductDTO productDTO) throws IOException {
    File directiory = new File("Product_Image" + productDTO.getId() + "/");
    if(directiory.isDirectory()){
        File [] files = directiory.listFiles();
        for (File f : files) {
            f.delete();
        }
        directiory.delete();
    }else {
        throw new IOException("Invalid directory path");
    }
    }
}
