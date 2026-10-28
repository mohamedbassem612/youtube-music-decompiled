package defpackage;

import android.view.View;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class adlw implements View.OnClickListener {
    private static final adlu a = new adls();
    private static final adlv b = new adlt();
    private vxe c;
    private final admd d;
    private final adlu e;
    private xgn f;
    private ajwo g;
    private Map h;
    private adlv i;

    public adlw(vxe vxeVar, admd admdVar, adlu adluVar) {
        vxeVar.getClass();
        this.c = vxeVar;
        this.d = admdVar;
        admdVar.d(this);
        admdVar.b(false);
        this.e = adluVar == null ? a : adluVar;
        this.f = xgn.l;
        this.i = b;
        this.h = Collections.EMPTY_MAP;
    }

    public final void a(xgn xgnVar, ajwo ajwoVar, Map map, adlv adlvVar) {
        if (xgnVar == null) {
            xgnVar = xgn.l;
        }
        this.f = xgnVar;
        this.g = ajwoVar;
        if (map == null) {
            map = Collections.EMPTY_MAP;
        }
        this.h = map;
        if (adlvVar == null) {
            adlvVar = b;
        }
        this.i = adlvVar;
        this.d.b(ajwoVar != null);
    }

    public final void b() {
        this.g = null;
        this.d.b(false);
        this.f = xgn.l;
        this.h = Collections.EMPTY_MAP;
        this.i = b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.e.hV(view)) {
            return;
        }
        ajwo ajwoVarF = this.f.f(this.g);
        this.g = ajwoVarF;
        vxe vxeVar = this.c;
        HashMap map = new HashMap();
        map.put("com.google.android.libraries.youtube.logging.interaction_logger", this.f);
        map.putAll(this.h);
        this.i.f(map);
        vxeVar.c(ajwoVarF, map);
    }

    public adlw(vxe vxeVar, View view, adlu adluVar) {
        this(vxeVar, new admz(view), adluVar);
    }

    public adlw(vxe vxeVar, View view) {
        this(vxeVar, new admz(view), (adlu) null);
    }
}
