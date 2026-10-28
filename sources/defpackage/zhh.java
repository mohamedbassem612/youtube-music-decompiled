package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class zhh implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return zhj.a.matcher(str).matches() || zhj.b.matcher(str).matches();
    }
}
