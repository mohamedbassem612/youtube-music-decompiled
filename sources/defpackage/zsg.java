package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class zsg extends zsi implements zsk {
    public static final Long e(tgo tgoVar) throws tzn {
        h(tgoVar);
        String strA = tgoVar.c.a("Content-Range");
        if (strA == null) {
            throw new tzn("Missing content range header");
        }
        int iLastIndexOf = strA.lastIndexOf("/") + 1;
        if (iLastIndexOf <= 0 || iLastIndexOf >= strA.length()) {
            throw new tzn("Invalid content range header");
        }
        try {
            return Long.valueOf(Long.parseLong(strA.substring(iLastIndexOf)));
        } catch (NumberFormatException e) {
            throw new tzn(e);
        }
    }

    @Override // defpackage.zsk
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public tgf b(Uri uri) {
        uri.getClass();
        tge tgeVarA = tgf.a(uri.toString());
        tgeVarA.b("Range", "bytes=0-1");
        tgeVarA.d(tok.CONTENT_LENGTH_GET_CONVERTER);
        return tgeVarA.a();
    }

    @Override // defpackage.zsi
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object d(tgo tgoVar) {
        return e(tgoVar);
    }

    @Override // defpackage.zsi, defpackage.zsl
    public final /* bridge */ /* synthetic */ Object d(Object obj) {
        return e((tgo) obj);
    }
}
