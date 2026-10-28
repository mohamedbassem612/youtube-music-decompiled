package defpackage;

import com.google.android.libraries.blocks.runtime.RuntimeStreamWriter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adtz implements adud {
    final /* synthetic */ mbb a;

    public adtz(mbb mbbVar) {
        this.a = mbbVar;
    }

    @Override // defpackage.adud
    public final /* bridge */ /* synthetic */ void a(Object obj, acjx acjxVar) {
        apjh apjhVar = (apjh) obj;
        if (apjhVar != null) {
            mbb mbbVar = this.a;
            aihf aihfVarCreateBuilder = asib.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            asib asibVar = (asib) aihfVarCreateBuilder.instance;
            asibVar.c = apjhVar;
            asibVar.b |= 1;
            mbbVar.d((asib) aihfVarCreateBuilder.build());
        }
        ((RuntimeStreamWriter) this.a).close();
    }

    @Override // defpackage.adud
    public final void b(toe toeVar, acjx acjxVar) {
        ((RuntimeStreamWriter) this.a).close();
    }
}
