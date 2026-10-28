package app.rive.core;

import app.rive.RiveLog;
import defpackage.awmy;
import defpackage.awqg;
import defpackage.awqx;
import defpackage.awrc;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class UniquePointer implements CheckableAutoCloseable {
    private static final String TAG = "Rive/UniquePointer";
    private final /* synthetic */ CloseOnce $$delegate_0;
    private final long cppPointer;
    private final String label;
    private final awqg onDispose;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = CloseOnce.$stable;

    public UniquePointer(final long j, final String str, final awqg awqgVar) {
        str.getClass();
        awqgVar.getClass();
        this.$$delegate_0 = new CloseOnce(str.concat(" (UniquePointer)"), new Function0() { // from class: app.rive.core.UniquePointer$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UniquePointer.__delegate_0$lambda$0(awqgVar, j, str);
            }
        });
        this.cppPointer = j;
        this.label = str;
        this.onDispose = awqgVar;
    }

    static final awmy __delegate_0$lambda$0(awqg awqgVar, long j, final String str) {
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.core.UniquePointer$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UniquePointer.__delegate_0$lambda$0$0(str);
            }
        });
        awqgVar.invoke(Long.valueOf(j));
        return awmy.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String __delegate_0$lambda$0$0(String str) {
        return "Disposing ".concat(String.valueOf(str));
    }

    private final long component1() {
        return this.cppPointer;
    }

    private final awqg component3() {
        return this.onDispose;
    }

    public static /* synthetic */ UniquePointer copy$default(UniquePointer uniquePointer, long j, String str, awqg awqgVar, int i, Object obj) {
        if ((i & 1) != 0) {
            j = uniquePointer.cppPointer;
        }
        if ((i & 2) != 0) {
            str = uniquePointer.label;
        }
        if ((i & 4) != 0) {
            awqgVar = uniquePointer.onDispose;
        }
        return uniquePointer.copy(j, str, awqgVar);
    }

    @Override // app.rive.core.CheckableAutoCloseable, java.lang.AutoCloseable
    public void close() {
        this.$$delegate_0.close();
    }

    public final String component2() {
        return this.label;
    }

    public final UniquePointer copy(long j, String str, awqg awqgVar) {
        str.getClass();
        awqgVar.getClass();
        return new UniquePointer(j, str, awqgVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UniquePointer) {
            UniquePointer uniquePointer = (UniquePointer) obj;
            if (this.cppPointer == uniquePointer.cppPointer && awrc.c(this.label, uniquePointer.label) && awrc.c(this.onDispose, uniquePointer.onDispose)) {
                return true;
            }
        }
        return false;
    }

    @Override // app.rive.core.CheckableAutoCloseable
    public boolean getClosed() {
        return this.$$delegate_0.getClosed();
    }

    public final String getLabel() {
        return this.label;
    }

    public final long getPointer() {
        if (!getClosed()) {
            return this.cppPointer;
        }
        throw new IllegalStateException("Attempting to access a disposed UniquePointer (" + this.label + ')');
    }

    public int hashCode() {
        return (((UniquePointer$$ExternalSyntheticBackport0.m(this.cppPointer) * 31) + this.label.hashCode()) * 31) + this.onDispose.hashCode();
    }

    public String toString() {
        return "UniquePointer(cppPointer=" + this.cppPointer + ", label=" + this.label + ", onDispose=" + this.onDispose + ')';
    }

    /* JADX INFO: compiled from: PG */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(awqx awqxVar) {
            this();
        }
    }
}
