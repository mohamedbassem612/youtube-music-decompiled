package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class awwz implements awph {
    final /* synthetic */ int a;
    final /* synthetic */ List b;

    public awwz(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.awph
    public final awph getCallerFrame() {
        return avkz.t(this.b, this.a + 1);
    }

    @Override // defpackage.awph
    public final StackTraceElement getStackTraceElement() {
        return (StackTraceElement) this.b.get(this.a);
    }
}
