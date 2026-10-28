package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ras extends rar {
    public ras(qup qupVar, int i, raq raqVar) {
        super(qupVar, i, raqVar);
    }

    @Override // defpackage.rar
    protected final atqv a(qup qupVar) {
        Uri uri = ((qwt) ((quv) qupVar.b).k).a;
        String scheme = uri.getScheme();
        String path = uri.getPath();
        if (scheme == null || path == null || !scheme.equals("file")) {
            throw new IllegalArgumentException("Unsupported URI for ImageSegmentSkiaConverter");
        }
        aihf aihfVarCreateBuilder = atqv.a.createBuilder();
        aihf aihfVarCreateBuilder2 = atre.a.createBuilder();
        aihf aihfVarCreateBuilder3 = atqw.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        atqw atqwVar = (atqw) aihfVarCreateBuilder3.instance;
        atqwVar.b = 2;
        atqwVar.c = path;
        aihfVarCreateBuilder2.copyOnWrite();
        atre atreVar = (atre) aihfVarCreateBuilder2.instance;
        atqw atqwVar2 = (atqw) aihfVarCreateBuilder3.build();
        atqwVar2.getClass();
        atreVar.c = atqwVar2;
        atreVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        atqv atqvVar = (atqv) aihfVarCreateBuilder.instance;
        atre atreVar2 = (atre) aihfVarCreateBuilder2.build();
        atreVar2.getClass();
        atqvVar.c = atreVar2;
        atqvVar.b = 2;
        return (atqv) aihfVarCreateBuilder.build();
    }
}
