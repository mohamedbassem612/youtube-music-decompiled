package defpackage;

import java.io.File;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class bgs extends awrb implements Function0 {
    public bgs(Object obj) {
        super(0, obj, Callable.class, "call", "call()Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        return (File) ((Callable) this.receiver).call();
    }
}
