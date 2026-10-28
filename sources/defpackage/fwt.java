package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class fwt implements FilenameFilter {
    final /* synthetic */ String a;

    public fwt(String str) {
        this.a = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(this.a);
    }
}
