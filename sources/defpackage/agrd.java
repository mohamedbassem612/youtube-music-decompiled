package defpackage;

import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agrd extends agrb implements agrc {
    final /* synthetic */ agrf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agrd(agrf agrfVar, Level level) {
        super(level);
        this.a = agrfVar;
    }

    @Override // defpackage.agrl
    protected final /* synthetic */ agqv c() {
        return this.a;
    }

    @Override // defpackage.agrl
    protected final /* bridge */ /* synthetic */ agru d() {
        return this;
    }
}
