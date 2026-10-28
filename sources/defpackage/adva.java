package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ListPopupWindow;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class adva implements View.OnClickListener, View.OnLongClickListener, aduw {
    private final Context a;
    public final adln b;
    public final admu c;
    public Object d;
    public xgn e;
    public final ci f;
    private final admo g;
    private final vxe h;
    private final Optional i;
    private final Optional j;
    private final Optional k;
    private final Object l;
    private volatile ListPopupWindow m;
    private final hef n;
    private final jnj o;

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.Map] */
    @Deprecated
    public adva(Context context, vxe vxeVar, advb advbVar, ci ciVar, ahek ahekVar, hef hefVar, jnj jnjVar, ci ciVar2, Optional optional, Optional optional2, Optional optional3) {
        vxeVar.getClass();
        context.getClass();
        advbVar.getClass();
        this.a = context;
        advbVar.b(anfv.class);
        adln adlnVarAi = ciVar.ai((admh) advbVar.io());
        this.b = adlnVarAi;
        admu admuVar = new admu();
        this.c = admuVar;
        adlnVarAi.h(admuVar);
        admh admhVar = (admh) advbVar.io();
        ci ciVar3 = (ci) ahekVar.b.io();
        ciVar3.getClass();
        admhVar.getClass();
        admo admoVar = new admo(ciVar3, admhVar, ahekVar.a, true);
        this.g = admoVar;
        admoVar.D(admuVar, null);
        this.n = hefVar;
        this.o = jnjVar;
        this.h = vxeVar;
        this.f = ciVar2;
        this.i = optional;
        this.j = optional2;
        this.k = optional3;
        this.l = new Object();
        if (ahud.c == null) {
            ahud.c = new ahud((char[]) null, (byte[]) null);
        }
        ahud.c.b.put(this, null);
    }

    private final boolean b(anfy anfyVar, Object obj) {
        if (anfyVar != null) {
            return aecm.x(anfyVar, obj, this.n, this.o) || (anfyVar.i && (anfyVar.b & 131072) != 0);
        }
        return false;
    }

    protected List a(anfy anfyVar, Object obj) {
        return aecm.w(anfyVar, obj, this.n, this.o);
    }

    @Override // defpackage.aduw
    public void c(View view, anfy anfyVar, Object obj, xgn xgnVar) {
        ci ciVar;
        boolean zB = b(anfyVar, obj);
        view.setVisibility(true != zB ? 8 : 0);
        view.setOnClickListener(this);
        view.setTag(R.id.innertube_menu_anchor_model, anfyVar);
        view.setTag(R.id.innertube_menu_anchor_tag, obj);
        view.setTag(R.id.innertube_menu_anchor_interaction_logger, xgnVar);
        view.setTag(R.id.innertube_menu_anchor_on_click_listener, this);
        if (anfyVar == null || !zB || (ciVar = this.f) == null) {
            return;
        }
        ciVar.ae(anfyVar, view);
    }

    @Override // defpackage.aduw
    public void d(View view, anfy anfyVar, Object obj, xgn xgnVar) {
        throw null;
    }

    @Override // defpackage.aduw
    public void g(View view) {
        throw null;
    }

    @Override // defpackage.aduw
    public void h(View view) {
        throw null;
    }

    @Override // defpackage.aduw
    public void i() {
        ListPopupWindow listPopupWindowN;
        synchronized (this.l) {
            if (this.m != null && (listPopupWindowN = n()) != null) {
                listPopupWindowN.dismiss();
            }
        }
    }

    public void k(anfy anfyVar, View view, Object obj, xgn xgnVar) {
        admu admuVar = this.c;
        admuVar.clear();
        Optional optional = this.k;
        optional.isPresent();
        Optional optional2 = this.i;
        optional2.isPresent();
        if (anfyVar.i && (anfyVar.b & 131072) != 0) {
            this.d = obj;
            this.e = xgnVar;
            vxe vxeVar = this.h;
            ajwo ajwoVar = anfyVar.j;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            vxeVar.a(ajwoVar);
            return;
        }
        agke agkeVarW = aecm.w(anfyVar, obj, this.n, this.o);
        int i = ((agpi) agkeVarW).d;
        for (int i2 = 0; i2 < i; i2++) {
            anfv anfvVar = (anfv) agkeVarW.get(i2);
            int i3 = anfvVar.b;
            Optional optionalOf = Optional.of(anfvVar);
            optionalOf.isPresent();
            admuVar.add(optionalOf.get());
            optional2.isPresent();
        }
        this.d = obj;
        this.e = xgnVar;
        optional2.isPresent();
        if (adzb.h(this.a, (vxz) optional.orElse(null), 2)) {
            this.j.isPresent();
        }
        ListPopupWindow listPopupWindowN = n();
        listPopupWindowN.setDropDownGravity(8388661);
        listPopupWindowN.setAnchorView(view);
        listPopupWindowN.show();
    }

    @Override // defpackage.aduw
    public final Map l() {
        HashMap map = new HashMap();
        map.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.d);
        map.put("com.google.android.libraries.youtube.logging.interaction_logger", this.e);
        this.k.isPresent();
        return map;
    }

    @Override // defpackage.aduw
    public final void m(View view, View view2, anfy anfyVar, Object obj, xgn xgnVar) {
        view.getClass();
        c(view2, anfyVar, obj, xgnVar);
        if (view2.getTag(R.id.innertube_menu_anchor_touch_handler) == null) {
            view2.setTag(R.id.innertube_menu_anchor_touch_handler, new aduz(view, view2));
        }
        if (anfyVar != null && b(anfyVar, obj) && anfyVar.g) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new adux(this, getClass().getSimpleName(), view, anfyVar, view2, obj, xgnVar));
        }
    }

    protected final ListPopupWindow n() {
        if (this.m == null) {
            synchronized (this.l) {
                if (this.m == null) {
                    Context context = this.a;
                    this.m = new ListPopupWindow(context);
                    this.m.setWidth(context.getResources().getDimensionPixelSize(R.dimen.innertube_menu_width));
                    this.m.setPromptPosition(1);
                    this.m.setInputMethodMode(2);
                    this.m.setModal(true);
                    this.m.setAdapter(this.b);
                    this.i.isPresent();
                }
            }
        }
        return this.m;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        anfy anfyVar = (anfy) view.getTag(R.id.innertube_menu_anchor_model);
        Object tag = view.getTag(R.id.innertube_menu_anchor_tag);
        Object tag2 = view.getTag(R.id.innertube_menu_anchor_interaction_logger);
        xgn xgnVar = tag2 instanceof xgn ? (xgn) tag2 : null;
        if (!anfyVar.i || (anfyVar.b & 131072) == 0) {
            if (b(anfyVar, tag)) {
                k(anfyVar, view, tag, xgnVar);
            }
        } else {
            vxe vxeVar = this.h;
            ajwo ajwoVar = anfyVar.j;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            vxeVar.a(ajwoVar);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        anfy anfyVar = (anfy) view.getTag(R.id.innertube_menu_anchor_model);
        Object tag = view.getTag(R.id.innertube_menu_anchor_tag);
        Object tag2 = view.getTag(R.id.innertube_menu_anchor_interaction_logger);
        xgn xgnVar = tag2 instanceof xgn ? (xgn) tag2 : null;
        if (anfyVar.i && (anfyVar.b & 131072) != 0) {
            vxe vxeVar = this.h;
            ajwo ajwoVar = anfyVar.j;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            vxeVar.a(ajwoVar);
        } else if (b(anfyVar, tag)) {
            k(anfyVar, view, tag, xgnVar);
            return true;
        }
        return false;
    }
}
