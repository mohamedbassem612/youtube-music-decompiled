package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awsw implements awsx {
    public final Function0 a;
    public final awqg b;

    public awsw(Function0 function0, awqg awqgVar) {
        this.a = function0;
        this.b = awqgVar;
    }

    @Override // defpackage.awsx
    public final Iterator a() {
        return new awsv(this);
    }
}
