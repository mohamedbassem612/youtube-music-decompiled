package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.music.R;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gyg extends gut {
    private final Context a;
    private final igy b;
    private final awmd c;
    private final awmd d;
    private final xit e;

    public gyg(Context context, igy igyVar, awmd awmdVar, awmd awmdVar2, xit xitVar) {
        this.a = context;
        this.b = igyVar;
        this.c = awmdVar;
        this.d = awmdVar2;
        this.e = xitVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apzf.b);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        if (((ycp) this.c.io()).e != null) {
            ((vxe) this.d.io()).c(fhz.P(this.a.getString(R.string.sideloaded_error_mdx)), null);
        } else {
            aase aaseVarA = hxb.a(map);
            aaseVarA.f(this.e.n(4));
            this.b.s(ajwoVar, aaseVarA.d());
        }
    }
}
