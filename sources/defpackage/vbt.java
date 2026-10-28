package defpackage;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import java.io.File;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class vbt extends AsyncTask {
    private final syw a;
    private final vbs b;

    public vbt(syw sywVar, vbs vbsVar) {
        this.a = sywVar;
        this.b = vbsVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Bitmap bitmap = ((Bitmap[]) objArr)[0];
        try {
            String str = String.valueOf(UUID.randomUUID()) + ".png";
            awpr awprVar = new awpr(null);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, awprVar);
            this.a.a(str, awprVar.toByteArray());
            aihf aihfVarCreateBuilder = vbu.a.createBuilder();
            String str2 = vcb.a;
            String path = new File("dynamic_stickers", str).getPath();
            aihfVarCreateBuilder.copyOnWrite();
            vbu vbuVar = (vbu) aihfVarCreateBuilder.instance;
            path.getClass();
            vbuVar.b |= 1;
            vbuVar.c = path;
            int width = bitmap.getWidth();
            aihfVarCreateBuilder.copyOnWrite();
            vbu vbuVar2 = (vbu) aihfVarCreateBuilder.instance;
            vbuVar2.b |= 2;
            vbuVar2.d = width;
            int height = bitmap.getHeight();
            aihfVarCreateBuilder.copyOnWrite();
            vbu vbuVar3 = (vbu) aihfVarCreateBuilder.instance;
            vbuVar3.b |= 4;
            vbuVar3.e = height;
            return (vbu) aihfVarCreateBuilder.build();
        } finally {
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        this.b.a((vbu) obj);
    }
}
