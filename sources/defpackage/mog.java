package defpackage;

import android.graphics.Rect;
import com.google.android.libraries.elements.converters.layout.FlowLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mog {
    public int a;
    public int b;
    public int c;
    public moh d;
    public final List e;
    public Map f;
    public int g;

    public mog(int i, moh mohVar) {
        this.a = -1;
        this.b = -1;
        this.c = -1;
        this.e = new ArrayList();
        this.g = 0;
        this.a = i;
        this.d = mohVar;
        this.f = new mof(this);
    }

    public final moe a(int i) {
        return ((mof) this.f).get(Integer.valueOf(i));
    }

    public final void b(moe moeVar) {
        moh mohVar;
        ArrayList arrayList = moeVar.d;
        if (arrayList.isEmpty()) {
            return;
        }
        this.e.add(moeVar);
        if (!FlowLayoutManager.j || !FlowLayoutManager.e || (mohVar = this.d) == null || mohVar.e != 1) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f.put(Integer.valueOf(((mod) arrayList.get(i)).a), moeVar);
            }
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((mod) arrayList.get(i2)).i = null;
        }
        moeVar.e = null;
    }

    public final void c(int i, moi moiVar) {
        int i2;
        moh mohVar;
        int i3 = 0;
        if (!FlowLayoutManager.i) {
            Iterator it = this.e.iterator();
            i2 = 0;
            while (it.hasNext()) {
                moe moeVar = (moe) it.next();
                if (moeVar.a() >= i) {
                    break;
                }
                if (!FlowLayoutManager.j || !FlowLayoutManager.e || (mohVar = this.d) == null || mohVar.e != 1) {
                    ArrayList arrayList = moeVar.d;
                    int size = arrayList.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        ((mof) this.f).remove(Integer.valueOf(((mod) arrayList.get(i4)).a));
                    }
                }
                if (FlowLayoutManager.t) {
                    moeVar.e();
                }
                it.remove();
                i2++;
            }
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (moe moeVar2 : this.e) {
                if (moeVar2.a() >= i) {
                    break;
                } else {
                    arrayList2.add(moeVar2);
                }
            }
            int size2 = arrayList2.size();
            i2 = 0;
            while (i3 < size2) {
                moe moeVar3 = (moe) arrayList2.get(i3);
                if (FlowLayoutManager.t) {
                    moeVar3.e();
                }
                moiVar.g(moeVar3, this);
                i3++;
                i2++;
            }
        }
        this.g += i2;
    }

    public final void d(moi moiVar) {
        if (FlowLayoutManager.t) {
            e();
        }
        if (FlowLayoutManager.i) {
            ArrayList arrayList = new ArrayList(this.e);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                moiVar.g((moe) arrayList.get(i), this);
            }
        }
        this.f = new mof(this);
        this.b = -1;
        boolean z = moiVar.e;
        this.c = 0;
        this.e.clear();
        this.g = 0;
    }

    public final void e() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((moe) it.next()).e();
        }
    }

    final void f(moe moeVar) {
        moh mohVar;
        if (!FlowLayoutManager.j || !FlowLayoutManager.e || (mohVar = this.d) == null || mohVar.e != 1) {
            ArrayList arrayList = moeVar.d;
            for (int i = 0; i < arrayList.size(); i++) {
                ((mof) this.f).remove(Integer.valueOf(((mod) arrayList.get(i)).a));
            }
        }
        if (FlowLayoutManager.t) {
            moeVar.e();
            moeVar.f();
        }
        this.e.remove(moeVar);
    }

    final void g() {
        if (FlowLayoutManager.t) {
            e();
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((moe) it.next()).f();
            }
        }
        this.f = new mof(this);
        this.a = -1;
        this.b = -1;
        this.c = -1;
        this.e.clear();
        this.g = 0;
        moh mohVar = this.d;
        if (mohVar != null) {
            mohVar.b = -1;
            mohVar.c = -1;
            Rect rect = mohVar.d;
            if (rect != moh.a) {
                rect.set(0, 0, 0, 0);
            }
            mohVar.e = -1;
        }
    }

    public final boolean h(int i) {
        Map map = this.f;
        if (map != null) {
            return map.containsKey(Integer.valueOf(i));
        }
        return false;
    }

    mog() {
        throw null;
    }
}
