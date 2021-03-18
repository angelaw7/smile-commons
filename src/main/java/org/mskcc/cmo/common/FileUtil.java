package org.mskcc.cmo.common;

import java.io.File;
import java.io.IOException;

public interface FileUtil {
    File getOrCreateFileWithHeader(String filepath, String header) throws IOException;
    void writeToFile(File file, String line) throws IOException;
}
