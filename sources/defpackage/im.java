package defpackage;

import android.content.Context;
import android.support.v7.view.menu.ExpandedMenuView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class im implements AdapterView.OnItemClickListener, jb {
    Context a;
    public LayoutInflater b;
    iq c;
    public ExpandedMenuView d;
    public ja e;
    public il f;

    public im(Context context) {
        this.a = context;
        this.b = LayoutInflater.from(context);
    }

    public final ListAdapter a() {
        il ilVar = this.f;
        if (ilVar != null) {
            return ilVar;
        }
        il ilVar2 = new il(this);
        this.f = ilVar2;
        return ilVar2;
    }

    @Override // defpackage.jb
    public final void b(Context context, iq iqVar) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = iqVar;
        il ilVar = this.f;
        if (ilVar != null) {
            ilVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.jb
    public final void c(iq iqVar, boolean z) {
        ja jaVar = this.e;
        if (jaVar != null) {
            jaVar.a(iqVar, z);
        }
    }

    @Override // defpackage.jb
    public final void d(ja jaVar) {
        throw null;
    }

    @Override // defpackage.jb
    public final boolean e() {
        return false;
    }

    @Override // defpackage.jb
    public final boolean f(jj jjVar) {
        if (!jjVar.hasVisibleItems()) {
            return false;
        }
        ir irVar = new ir(jjVar);
        iq iqVar = irVar.a;
        fu fuVar = new fu(iqVar.a);
        irVar.c = new im(fuVar.getContext());
        im imVar = irVar.c;
        imVar.e = irVar;
        iqVar.g(imVar);
        ListAdapter listAdapterA = irVar.c.a();
        fq fqVar = fuVar.a;
        fqVar.o = listAdapterA;
        fqVar.p = irVar;
        View view = iqVar.g;
        if (view != null) {
            fuVar.b(view);
        } else {
            fuVar.c(iqVar.f);
            fuVar.setTitle(iqVar.e);
        }
        fqVar.m = irVar;
        irVar.b = fuVar.create();
        irVar.b.setOnDismissListener(irVar);
        WindowManager.LayoutParams attributes = irVar.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        irVar.b.show();
        ja jaVar = this.e;
        if (jaVar != null) {
            jaVar.b(jjVar);
        }
        return true;
    }

    @Override // defpackage.jb
    public final boolean g(is isVar) {
        return false;
    }

    @Override // defpackage.jb
    public final boolean h(is isVar) {
        return false;
    }

    @Override // defpackage.jb
    public final void i() {
        il ilVar = this.f;
        if (ilVar != null) {
            ilVar.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.z(this.f.getItem(i), this, 0);
    }
}
