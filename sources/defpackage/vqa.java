package defpackage;

import android.support.v7.widget.RecyclerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class vqa extends tud {
    final /* synthetic */ float a;
    final /* synthetic */ avju b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vqa(avju avjuVar, String str, float f) {
        super(str);
        this.a = f;
        this.b = avjuVar;
    }

    @Override // defpackage.tud
    protected final void a() {
        avju avjuVar = this.b;
        avjuVar.b = avju.a(((RecyclerView) avjuVar.a).getHeight(), this.a);
    }
}
