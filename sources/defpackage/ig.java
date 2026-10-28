package defpackage;

import android.support.v7.view.menu.ActionMenuItemView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ig extends mg {
    final /* synthetic */ ActionMenuItemView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ig(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.a = actionMenuItemView;
    }

    @Override // defpackage.mg
    public final jf a() {
        js jsVar;
        qcb qcbVar = this.a.c;
        if (qcbVar == null || (jsVar = ((jx) qcbVar.a).j) == null) {
            return null;
        }
        return jsVar.a();
    }

    @Override // defpackage.mg
    protected final boolean b() {
        jf jfVarA;
        ActionMenuItemView actionMenuItemView = this.a;
        ip ipVar = actionMenuItemView.b;
        return ipVar != null && ipVar.b(actionMenuItemView.a) && (jfVarA = a()) != null && jfVarA.u();
    }
}
