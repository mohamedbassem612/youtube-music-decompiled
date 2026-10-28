package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Message;
import android.text.Layout;
import android.text.Spanned;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.blocks.Container;
import com.google.android.libraries.elements.interfaces.CallBlockMethodCommandHandler;
import com.google.android.material.tabs.TabLayout;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class heg {
    public Object a;

    public heg(did didVar) {
        if (didVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        didVar.c();
        if (didVar.c.isEmpty()) {
            return;
        }
        this.a = new ArrayList(didVar.c);
    }

    public static final void j(Map map) {
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((jij) it.next()).s();
        }
    }

    public final void a(ajno ajnoVar) {
        ajnoVar.getClass();
        this.a = ajnoVar;
    }

    public final Optional b() {
        return Optional.ofNullable(this.a);
    }

    public final boolean c(amzh amzhVar) {
        if (Objects.equals(this.a, amzhVar)) {
            return false;
        }
        this.a = amzhVar;
        return true;
    }

    public final gnl d() {
        return new gnl((Optional) this.a);
    }

    public final void e(xir xirVar) {
        this.a = Optional.of(xirVar);
    }

    public final void f(int i) {
        Object obj = this.a;
        if (obj != null) {
            get getVar = (get) ((hhb) obj).a;
            hkl hklVar = getVar.bV;
            hklVar.p = i;
            TabLayout tabLayout = hklVar.g;
            if (tabLayout != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tabLayout.getLayoutParams();
                if (marginLayoutParams != null) {
                    marginLayoutParams.bottomMargin = hklVar.p;
                    hklVar.g.setLayoutParams(marginLayoutParams);
                }
                hklVar.l();
            }
            getVar.j.G();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final List g() {
        ?? r0 = this.a;
        this.a = Collections.EMPTY_LIST;
        return r0;
    }

    public final void h(View view, MotionEvent motionEvent) {
        Object obj = this.a;
        if (obj != null) {
            fhz.a((fip) obj, view, motionEvent);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Map] */
    public final void i(List list) {
        gzj.aS();
        ?? r0 = this.a;
        if (r0 == 0 && list == null) {
            return;
        }
        if (list == null) {
            j(r0);
            this.a = null;
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jij jijVar = (jij) it.next();
            linkedHashMap.put(jijVar.c, jijVar);
        }
        ?? r5 = this.a;
        if (r5 == 0) {
            Iterator it2 = linkedHashMap.values().iterator();
            while (it2.hasNext()) {
                ((jij) it2.next()).r();
            }
        } else {
            for (Map.Entry entry : r5.entrySet()) {
                if (!linkedHashMap.containsKey(entry.getKey())) {
                    ((jij) entry.getValue()).s();
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                if (((jij) this.a.get(entry2.getKey())) == null) {
                    ((jij) entry2.getValue()).r();
                }
            }
        }
        this.a = linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    public final did k() {
        if (this.a == null) {
            return did.a;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", (ArrayList) this.a);
        return new did(bundle, this.a);
    }

    public final void l(Collection collection) {
        if (collection.isEmpty()) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m((String) it.next());
        }
    }

    public final void m(String str) {
        if (str == null) {
            throw new IllegalArgumentException("category must not be null");
        }
        if (this.a == null) {
            this.a = new ArrayList();
        }
        if (((ArrayList) this.a).contains(str)) {
            return;
        }
        ((ArrayList) this.a).add(str);
    }

    public final void n(did didVar) {
        if (didVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        l(didVar.b());
    }

    public final void o() {
        this.a = null;
        List list = bwl.a;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(this);
            }
        }
    }

    public final void p() {
        Object obj = this.a;
        obj.getClass();
        ((Message) obj).sendToTarget();
        o();
    }

    public final soj q() {
        Object obj = this.a;
        if (obj != null) {
            return new soj((aolc) obj);
        }
        throw new IllegalStateException("Missing required properties: renderer");
    }

    public final void r(aolc aolcVar) {
        if (aolcVar == null) {
            throw new NullPointerException("Null renderer");
        }
        this.a = aolcVar;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    public final void s() {
        qpj.c();
        this.a.getClass();
        for (qnn qnnVar : qnn.values()) {
            qno qnoVar = (qno) this.a.get(qnnVar);
            if (qnoVar != null) {
                qnoVar.a();
            }
        }
        this.a = null;
    }

    public final void t(Canvas canvas) {
        Object obj = this.a;
        if (obj == null) {
            return;
        }
        int i = 0;
        while (true) {
            mrr[] mrrVarArr = (mrr[]) obj;
            if (i >= mrrVarArr.length) {
                return;
            }
            mrrVarArr[i].d(canvas);
            i++;
        }
    }

    public final void u(Canvas canvas) {
        Object obj = this.a;
        if (obj == null) {
            return;
        }
        int i = 0;
        while (true) {
            mrr[] mrrVarArr = (mrr[]) obj;
            if (i >= mrrVarArr.length) {
                return;
            }
            mrrVarArr[i].a(canvas);
            i++;
        }
    }

    public final void v(Layout layout, CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            mrr[] mrrVarArr = (mrr[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), mrr.class);
            this.a = mrrVarArr;
            for (mrr mrrVar : mrrVarArr) {
                mrrVar.b(layout, charSequence);
            }
        }
    }

    public final boolean w() {
        Object obj = this.a;
        if (obj == null) {
            return false;
        }
        int i = 0;
        while (true) {
            mrr[] mrrVarArr = (mrr[]) obj;
            if (i >= mrrVarArr.length) {
                return false;
            }
            if (mrrVarArr[i].f()) {
                return true;
            }
            i++;
        }
    }

    public heg(Object obj) {
        this.a = obj;
    }

    public heg(Map map) {
        this.a = map;
    }

    public heg(char[] cArr) {
    }

    public heg(ajno ajnoVar) {
        a(ajnoVar);
    }

    public heg(Container container) {
        this.a = null;
        CallBlockMethodCommandHandler callBlockMethodCommandHandlerCreate = CallBlockMethodCommandHandler.create(container);
        if (callBlockMethodCommandHandlerCreate != null) {
            this.a = callBlockMethodCommandHandlerCreate.handler();
        }
    }

    public heg() {
        this.a = null;
    }

    public heg(byte[] bArr) {
        this.a = new abgi(abgh.a, false);
    }

    public heg(jkp jkpVar) {
        ibv ibvVar = ibv.LOOP_OFF;
        this.a = (ibv) ibv.e.getOrDefault(Integer.valueOf(jkpVar.getInt(gzj.LOOP_MODE, ibvVar.g)), ibvVar);
    }

    public heg(char[] cArr, char[] cArr2) {
        this.a = Collections.EMPTY_LIST;
    }

    public heg(Context context, fwz fwzVar) {
        this.a = jvt.a(context, Executors.newCachedThreadPool(), fwzVar);
    }

    public heg(short[] sArr) {
        this.a = Optional.empty();
    }

    public heg(gnl gnlVar) {
        this.a = Optional.empty();
        this.a = gnlVar.b;
    }

    public heg(Context context, Executor executor, fwz fwzVar) {
        this.a = jvt.a(context, executor, fwzVar);
    }
}
