package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    private ImageReaderFactory() {

    }

    public static ImageReader getImageReader(ImageTypes type) {
        if (type == null) {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
        ImageReader imageReader;
        switch (type) {
            case BMP -> imageReader = new BmpReader();
            case JPG -> imageReader = new JpgReader();
            case PNG -> imageReader = new PngReader();
            default -> throw new IllegalArgumentException("Неизвестный тип картинки");
        }
        return imageReader;
    }
}