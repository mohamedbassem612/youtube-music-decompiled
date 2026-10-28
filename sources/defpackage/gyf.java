package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gyf extends gut {
    private final Context a;
    private final ico b;
    private final awmd c;
    private final awmd d;
    private final hfn e;

    public gyf(Context context, ico icoVar, awmd awmdVar, awmd awmdVar2, hfn hfnVar) {
        this.a = context;
        this.b = icoVar;
        this.c = awmdVar;
        this.d = awmdVar2;
        this.e = hfnVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVar = apzd.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        apzd apzdVar = (apzd) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        apze apzeVar = apzdVar.d;
        if (apzeVar == null) {
            apzeVar = apze.a;
        }
        ico icoVar = this.b;
        if (icoVar.j()) {
            ((vxe) this.d.io()).c(fhz.P(this.a.getString(R.string.sideloaded_error_mixed_queue_tracks)), null);
            return;
        }
        if (((ycp) this.c.io()).e != null) {
            ((vxe) this.d.io()).c(fhz.P(this.a.getString(R.string.sideloaded_error_mdx)), null);
            return;
        }
        if (apzdVar.f.size() > 0) {
            ArrayList arrayList = new ArrayList(apzdVar.f.size());
            for (int i = 0; i < apzdVar.f.size(); i++) {
                arrayList.add((ajwo) apzdVar.f.get(i));
            }
            ((vxe) this.d.io()).d(arrayList, map);
        }
        if (!icoVar.h()) {
            if (map != null) {
                Object obj = map.get("com.google.android.libraries.youtube.innertube.endpoint.tag");
                if (obj instanceof aoun) {
                    hzf hzfVarS = this.e.s((aoun) obj);
                    apcc apccVarA = apcc.a(apzdVar.e);
                    if (apccVarA == null) {
                        apccVarA = apcc.MODE_UNSPECIFIED;
                    }
                    if (icoVar.k(hzfVarS, apccVarA)) {
                        return;
                    }
                }
            }
            icoVar.c(ajwoVar);
            return;
        }
        aihf aihfVarCreateBuilder = apzf.a.createBuilder();
        String str = apzeVar.d;
        aihfVarCreateBuilder.copyOnWrite();
        apzf apzfVar = (apzf) aihfVarCreateBuilder.instance;
        str.getClass();
        apzfVar.c |= 2;
        apzfVar.e = str;
        String str2 = apzeVar.c;
        aihfVarCreateBuilder.copyOnWrite();
        apzf apzfVar2 = (apzf) aihfVarCreateBuilder.instance;
        str2.getClass();
        apzfVar2.c |= 1;
        apzfVar2.d = str2;
        apzf apzfVar3 = (apzf) aihfVarCreateBuilder.build();
        HashMap map2 = new HashMap();
        Boolean bool = Boolean.TRUE;
        map2.put("watch_start_paused", bool);
        map2.put("watch_mode_miniplayer", bool);
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihhVar.e(ish.a, apzfVar3);
        ((vxe) this.d.io()).c((ajwo) aihhVar.build(), map2);
    }
}
