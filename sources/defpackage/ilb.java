package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ilb extends qa {
    final /* synthetic */ ilc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ilb(ilc ilcVar) {
        super((byte[]) null);
        this.a = ilcVar;
    }

    @Override // defpackage.qa
    public final void e(RecyclerView recyclerView, int i, int i2) {
        if (i2 > 0) {
            np npVar = recyclerView.n;
            npVar.getClass();
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) npVar;
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            int itemCount = linearLayoutManager.getItemCount();
            int i3 = itemCount - 6;
            ilc ilcVar = this.a;
            hmy hmyVar = (hmy) ilcVar.a().l.c();
            if (ilcVar.t || itemCount <= 0 || iFindLastVisibleItemPosition < i3 || !(hmyVar instanceof ili)) {
                return;
            }
            iky ikyVarA = ilcVar.a();
            hmy hmyVar2 = (hmy) ikyVarA.l.c();
            axaf axafVar = ikyVarA.j;
            if (!((Boolean) axafVar.c()).booleanValue() && (hmyVar2 instanceof ili) && ((ili) hmyVar2).c) {
                axafVar.d(Boolean.TRUE);
                axaf axafVar2 = ikyVarA.h;
                axafVar2.d(Integer.valueOf(((Number) axafVar2.c()).intValue() + 1));
            }
        }
    }
}
