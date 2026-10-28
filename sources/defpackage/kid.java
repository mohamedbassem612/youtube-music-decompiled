package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Random;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class kid {
    public final Random a;

    public kid() {
        this(new Random());
    }

    public abstract ListenableFuture a(kiy kiyVar);

    public auli b() {
        throw null;
    }

    public kid(Random random) {
        this.a = random;
    }
}
