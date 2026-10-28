package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class gtb extends gut {
    public final Context a;
    public final hyf b;
    private final abvk c;

    public gtb(Context context, hyf hyfVar, abvk abvkVar) {
        this.a = context;
        this.b = hyfVar;
        this.c = abvkVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajod.b);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        gxw gxwVar = new gxw(this, 1);
        acag acagVar = this.c.g;
        String string = acagVar.b.getString(R.string.turn_off_subtitles);
        wjf wjfVar = acagVar.p;
        if (wjfVar != null && acagVar.p()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(acca.b(string));
            arrayList.addAll(aawo.e(wjfVar, acagVar.a()));
            gxwVar.b(null, arrayList);
            return;
        }
        accc acccVar = acagVar.o;
        if (acccVar != null) {
            gxwVar.b(null, acccVar.h());
        } else {
            gxwVar.iT(null, null);
        }
    }
}
