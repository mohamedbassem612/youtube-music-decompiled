package defpackage;

import java.util.Random;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qjb {
    public final float a;
    public final Object b;

    public qjb(Random random, float f) {
        boolean z = false;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        ahno.G(z, "Sampling rate should be a floating number >= 0 and <= 1.");
        this.a = f;
        this.b = random;
    }

    public qjb(String str, float f) {
        this.b = str;
        this.a = f;
    }
}
