package com.hsp.example.hsutils.utils;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by hsp on 2017/12/06.
 * <p>
 * IO流工具类
 */
public class IOUtils {
    /**
     * 关闭流
     */
    public static boolean close(Closeable io) {
        if (io != null) {
            try {
                io.close();
            } catch (IOException e) {
                LogUtils.e(e);
            }
        }
        return true;
    }
}
