package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aclf implements acko {
    private final aclc i;
    public final Typeface a = Typeface.create(Typeface.SANS_SERIF, 1);
    private final awmi b = new awmp(new zqe(this, 15));
    private final awmi c = new awmp(new zqe(this, 16));
    private final awmi d = new awmp(new zqe(this, 17));
    private final awmi e = new awmp(new zqe(this, 18));
    private final awmi f = new awmp(new zqe(this, 19));
    private final awmi g = new awmp(new zqe(this, 20));
    private final awmi h = new awmp(new acoo(this, 1));
    private final ijt j = new ijt(14);
    private final ijt k = new ijt(4);

    public aclf(aclc aclcVar) {
        this.i = aclcVar;
    }

    private final ackr f() {
        return (ackr) this.d.a();
    }

    private final ackr g(int i) {
        if (i == 300) {
            return (ackr) this.c.a();
        }
        if (i == 400) {
            return f();
        }
        if (i == 500) {
            return (ackr) this.e.a();
        }
        if (i == 600) {
            return (ackr) this.f.a();
        }
        if (i == 700) {
            return e();
        }
        if (i != 800) {
            return i != 900 ? f() : (ackr) this.h.a();
        }
        return (ackr) this.g.a();
    }

    private final boolean h(int i, Typeface typeface) {
        if (typeface != this.a) {
            return i != 700 && typeface == e().a();
        }
        return true;
    }

    @Override // defpackage.acko
    public final int a() {
        return 2;
    }

    @Override // defpackage.acko
    public final /* synthetic */ String b() {
        return aavv.u(this);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x007c  */
    @Override // defpackage.acko
    public final Typeface c(Context context, int i, int i2) {
        Typeface typefaceCreate;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        Typeface typefaceA = g(i).a();
        if (typefaceA == null) {
            if (i == 700) {
                typefaceA = this.a;
                typefaceA.getClass();
            } else {
                typefaceA = e().a();
                if (typefaceA == null) {
                    typefaceA = this.a;
                }
                typefaceA.getClass();
            }
        }
        Typeface typefaceI = h(i, typefaceA) ? this.k.i(i, i2, typefaceA) : this.j.i(i, i2, typefaceA);
        if (typefaceI != null) {
            return typefaceI;
        }
        int i3 = 1;
        Typeface typefaceC = g(i).c(context, i == 700);
        if (typefaceC == null) {
            return null;
        }
        boolean zH = h(i, typefaceC);
        if (Build.VERSION.SDK_INT < 28 || zH) {
            if (!h(i, typefaceC)) {
                i3 = i2;
            } else if (i2 == 2 || i2 == 3) {
                i3 = 3;
            }
            if (i3 != 0 || zH) {
                typefaceCreate = Typeface.create(typefaceC, i3);
                typefaceCreate.getClass();
            } else {
                typefaceCreate = typefaceC;
            }
        } else if ((i2 & 2) != 0) {
            typefaceCreate = Typeface.create(typefaceC, i, true);
            typefaceCreate.getClass();
        } else {
            typefaceCreate = typefaceC;
        }
        if (zH) {
            this.k.j(i, i2, typefaceC, typefaceCreate);
        } else {
            this.j.j(i, i2, typefaceC, typefaceCreate);
        }
        return typefaceCreate;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [awut, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [awou, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, mbc] */
    public final ackr d(int i) {
        int i2;
        ackr ackrVar;
        if (i != 300) {
            i2 = R.font.youtube_sans;
            if (i != 400) {
                if (i == 500) {
                    i2 = R.font.youtube_sans_medium;
                } else if (i == 600) {
                    i2 = R.font.youtube_sans_semibold;
                } else if (i == 700) {
                    i2 = R.font.youtube_sans_bold;
                } else if (i == 800) {
                    i2 = R.font.youtube_sans_extrabold;
                } else if (i == 900) {
                    i2 = R.font.youtube_sans_black;
                }
            }
        } else {
            i2 = R.font.youtube_sans_light;
        }
        int i3 = i2;
        if (i == 700) {
            final int i4 = 1;
            ackrVar = new ackr(this) { // from class: acle
                public final /* synthetic */ aclf a;

                {
                    this.a = this;
                }

                @Override // defpackage.ackr
                public final /* synthetic */ Typeface a() {
                    return null;
                }

                @Override // defpackage.ackr
                public final Typeface b(Context context) {
                    Typeface typefaceC;
                    int i5 = i4;
                    aclf aclfVar = this.a;
                    return (i5 != 0 || (typefaceC = aclfVar.e().c(context, true)) == null) ? aclfVar.a : typefaceC;
                }

                @Override // defpackage.ackr
                public final /* synthetic */ Typeface c(Context context, boolean z) {
                    int i5 = i4;
                    return b(context);
                }
            };
        } else {
            final int i5 = 0;
            ackrVar = new ackr(this) { // from class: acle
                public final /* synthetic */ aclf a;

                {
                    this.a = this;
                }

                @Override // defpackage.ackr
                public final /* synthetic */ Typeface a() {
                    return null;
                }

                @Override // defpackage.ackr
                public final Typeface b(Context context) {
                    Typeface typefaceC;
                    int i6 = i5;
                    aclf aclfVar = this.a;
                    return (i6 != 0 || (typefaceC = aclfVar.e().c(context, true)) == null) ? aclfVar.a : typefaceC;
                }

                @Override // defpackage.ackr
                public final /* synthetic */ Typeface c(Context context, boolean z) {
                    int i6 = i5;
                    return b(context);
                }
            };
        }
        ackr ackrVar2 = ackrVar;
        aclc aclcVar = this.i;
        Object objIo = aclcVar.a.io();
        objIo.getClass();
        axlj axljVar = (axlj) objIo;
        awmd awmdVar = (awmd) awrc.f((Optional) aclcVar.b);
        if (awmdVar != null) {
        }
        ?? r8 = aclcVar.e;
        return new acky(i3, axljVar, aclcVar.c, aclcVar.d, ackrVar2, r8);
    }

    public final ackr e() {
        return (ackr) this.b.a();
    }
}
