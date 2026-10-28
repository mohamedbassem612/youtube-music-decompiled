package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class awpt extends IOException {
    public awpt(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            Objects.toString(file2);
            sb.append(" -> ".concat(file2.toString()));
        }
        sb.append(": ".concat(str));
        super(sb.toString());
    }
}
