package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dyj {
    public Executor a;
    public awou b;
    public dzv c;
    public Executor d;
    public dzp e;
    public String f;

    public static /* synthetic */ void a(AtomicBoolean atomicBoolean, aqi aqiVar, Function0 function0) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            aqiVar.b(function0.invoke());
        } catch (Throwable th) {
            aqiVar.d(th);
        }
    }
}
