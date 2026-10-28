package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.elements.interfaces.ByteStore;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aczt extends qa {
    final /* synthetic */ aczv a;
    private boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aczt(aczv aczvVar) {
        super((byte[]) null);
        this.a = aczvVar;
        this.b = true;
    }

    @Override // defpackage.qa
    public final void e(RecyclerView recyclerView, int i, int i2) {
        boolean zCanScrollVertically = recyclerView.canScrollVertically(-1);
        boolean z = this.b;
        if (zCanScrollVertically) {
            if (z) {
                ByteStore byteStore = (ByteStore) this.a.l.io();
                aihf aihfVarCreateBuilder = aspt.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                aspt asptVar = (aspt) aihfVarCreateBuilder.instance;
                asptVar.b |= 1;
                asptVar.c = false;
                byteStore.set("bottom_sheet_scroll_position_key", ((aspt) aihfVarCreateBuilder.build()).toByteArray());
                this.b = false;
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        ByteStore byteStore2 = (ByteStore) this.a.l.io();
        aihf aihfVarCreateBuilder2 = aspt.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        aspt asptVar2 = (aspt) aihfVarCreateBuilder2.instance;
        asptVar2.b |= 1;
        asptVar2.c = true;
        byteStore2.set("bottom_sheet_scroll_position_key", ((aspt) aihfVarCreateBuilder2.build()).toByteArray());
        this.b = true;
    }
}
