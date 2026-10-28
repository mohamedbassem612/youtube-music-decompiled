package defpackage;

import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class wme extends GZIPOutputStream {
    final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wme(OutputStream outputStream, int i) {
        super(outputStream);
        this.a = i;
        this.def.setLevel(i);
    }
}
