package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zsh extends zsi implements zsk {
    public static final Long a(tgo tgoVar) throws tzn {
        h(tgoVar);
        String strA = tgoVar.c.a("Content-Length");
        if (strA == null) {
            throw new tzn("Missing content length header");
        }
        try {
            return Long.valueOf(Long.parseLong(strA));
        } catch (NumberFormatException e) {
            throw new tzn(e);
        }
    }

    @Override // defpackage.zsk
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        Uri uri = (Uri) obj;
        uri.getClass();
        String string = uri.toString();
        tge tgeVar = new tge();
        tgeVar.a = 5;
        tgeVar.b = string;
        tgeVar.d(tok.CONTENT_LENGTH_HEAD_CONVERTER);
        return tgeVar.a();
    }

    @Override // defpackage.zsi
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object d(tgo tgoVar) {
        return a(tgoVar);
    }

    @Override // defpackage.zsi, defpackage.zsl
    public final /* bridge */ /* synthetic */ Object d(Object obj) {
        return a((tgo) obj);
    }
}
