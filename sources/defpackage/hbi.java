package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.ImageView;
import com.google.android.libraries.elements.adl.UpbArena;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hbi implements nuw {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/elements/imageprocessors/MusicThumbnailImageProcessorConverter");
    private final avmb b;
    private final Context c;
    private final nuc d;
    private final DisplayMetrics e;
    private final wbz f;
    private final iwm g;
    private final vxz h;

    public hbi(avmb avmbVar, Context context, nuc nucVar, wbz wbzVar, iwm iwmVar, vxz vxzVar) {
        this.b = avmbVar;
        this.c = context;
        this.d = nucVar;
        this.e = context.getResources().getDisplayMetrics();
        this.f = wbzVar;
        this.g = iwmVar;
        this.h = vxzVar;
    }

    private final wby d() {
        return this.f.c();
    }

    @Override // defpackage.nuw
    public final /* bridge */ /* synthetic */ Drawable a(Object obj, Bitmap bitmap, ImageView.ScaleType scaleType, nsl nslVar) {
        anyh anyhVar = (anyh) obj;
        if (!anyhVar.f.isEmpty()) {
            d().g(anyhVar.f).s(this.b).i(new hbh(bitmap, d(), this.g, anyhVar)).j(new glg(11)).H();
        }
        int i = anyhVar.c;
        float fApplyDimension = 0.0f;
        boolean zBooleanValue = false;
        nhp nhpVarAT = null;
        if ((i & 1) != 0) {
            askz askzVar = anyhVar.d;
            if (askzVar == null) {
                askzVar = askz.a;
            }
            fApplyDimension = TypedValue.applyDimension(1, askzVar.c == 3 ? ((Float) askzVar.d).floatValue() : 0.0f, this.e);
            zBooleanValue = askzVar.c == 4 ? ((Boolean) askzVar.d).booleanValue() : false;
            if ((askzVar.b & 4) != 0) {
                aslb aslbVar = askzVar.e;
                if (aslbVar == null) {
                    aslbVar = aslb.a;
                }
                nhpVarAT = nhp.aT(aslbVar.toByteArray(), new UpbArena());
            }
        } else if ((i & 2) == 0) {
            return new mfj(bitmap, scaleType, this.d);
        }
        nhp nhpVar = nhpVarAT;
        boolean z = zBooleanValue;
        float f = fApplyDimension;
        Context context = this.c;
        DisplayMetrics displayMetrics = this.e;
        hbj hbjVar = new hbj(bitmap, scaleType, f, z, context, displayMetrics, this.d);
        if (nhpVar != null) {
            hbjVar.c(nhpVar, displayMetrics, nslVar);
        }
        if ((anyhVar.c & 2) != 0) {
            anyg anygVar = anyhVar.e;
            if (anygVar == null) {
                anygVar = anyg.a;
            }
            hbjVar.a(anygVar, this.h);
        }
        return hbjVar;
    }

    @Override // defpackage.nuw
    public final /* synthetic */ Drawable b(Object obj, Drawable drawable, ImageView.ScaleType scaleType, nsl nslVar) {
        return nra.a(this, obj, drawable, scaleType, nslVar);
    }

    @Override // defpackage.nuw
    public final aigw c() {
        return anyh.b;
    }
}
