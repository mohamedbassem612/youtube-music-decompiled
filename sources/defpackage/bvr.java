package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bvr {
    private final String[] a;
    private boolean b;
    private boolean c;

    public bvr(String... strArr) {
        this.a = strArr;
    }

    protected abstract void a(String str);

    public final synchronized boolean b() {
        if (!this.b) {
            this.b = true;
            try {
                for (String str : this.a) {
                    a(str);
                }
                this.c = true;
            } catch (UnsatisfiedLinkError e) {
                bvx.f("LibraryLoader", "Failed to load ".concat(String.valueOf(Arrays.toString(this.a))), e);
            }
        }
        return this.c;
    }
}
