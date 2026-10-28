package defpackage;

import com.google.android.libraries.blocks.runtime.InstanceProxy;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class admt extends adlq {
    public final boolean a;
    public final boolean b;
    public int d;
    public apkx e;
    private final List f;
    private final Supplier g;
    private final Optional h;
    private final boolean i;
    private final boolean j;
    private int k;
    private boolean l;

    public admt(Supplier supplier, Optional optional, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(z);
        this.k = -1;
        this.l = false;
        this.d = 1;
        this.e = apkx.a;
        this.g = supplier;
        this.h = optional;
        this.f = new ArrayList();
        this.a = z2;
        this.i = z3;
        this.j = z4;
        this.b = z5;
    }

    private final ascp H(int i, apkx apkxVar) {
        aihf aihfVarCreateBuilder = ascp.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ascp ascpVar = (ascp) aihfVarCreateBuilder.instance;
        ascpVar.b |= 1;
        ascpVar.c = i;
        aihfVarCreateBuilder.copyOnWrite();
        ascp ascpVar2 = (ascp) aihfVarCreateBuilder.instance;
        apkxVar.getClass();
        ascpVar2.d = apkxVar;
        ascpVar2.b |= 2;
        int i2 = 0;
        while (true) {
            List list = this.f;
            if (i2 >= list.size()) {
                return (ascp) aihfVarCreateBuilder.build();
            }
            aihf aihfVarCreateBuilder2 = ascn.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            ascn ascnVar = (ascn) aihfVarCreateBuilder2.instance;
            ascnVar.b |= 1;
            ascnVar.c = i2;
            boolean zG = G(((adlo) list.get(i2)).a);
            aihfVarCreateBuilder2.copyOnWrite();
            ascn ascnVar2 = (ascn) aihfVarCreateBuilder2.instance;
            ascnVar2.b |= 2;
            ascnVar2.d = zG;
            ascn ascnVar3 = (ascn) aihfVarCreateBuilder2.build();
            aihfVarCreateBuilder.copyOnWrite();
            ascp ascpVar3 = (ascp) aihfVarCreateBuilder.instance;
            ascnVar3.getClass();
            aiie aiieVar = ascpVar3.e;
            if (!aiieVar.c()) {
                ascpVar3.e = aihn.mutableCopy(aiieVar);
            }
            ascpVar3.e.add(ascnVar3);
            i2++;
        }
    }

    private final void I(int i, int i2) {
        List list = this.c;
        int i3 = ((adlo) list.get(i)).b;
        y(i3, ((adlo) list.get(i2)).f() - i3);
    }

    @Override // defpackage.adlq
    protected final adlo D(adkz adkzVar) {
        return new adms(this, adkzVar);
    }

    @Override // defpackage.adlq
    protected final adlo E(int i) {
        List list = this.f;
        adlo adloVarE = super.E(i);
        list.remove(adloVarE);
        return adloVarE;
    }

    @Override // defpackage.adlq
    public final void F(adkz adkzVar, adkz adkzVar2) {
        if (this.j) {
            int i = 0;
            while (true) {
                List list = this.f;
                if (i >= list.size()) {
                    i = -1;
                    break;
                } else if (((adlo) list.get(i)).a == adkzVar) {
                    break;
                } else {
                    i++;
                }
            }
            this.k = i;
            this.l = true;
        }
        try {
            super.F(adkzVar, adkzVar2);
            if (this.j) {
                this.l = false;
                this.k = -1;
            }
            b();
        } catch (Throwable th) {
            if (this.j) {
                this.l = false;
                this.k = -1;
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [adkz, java.lang.Object] */
    public final boolean G(adkz adkzVar) {
        if (adkzVar.a() != 1) {
            return true;
        }
        Optional optionalOfNullable = this.h;
        adha adhaVar = new adha(adkzVar, 3);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(Boolean.valueOf(((ci) optionalOfNullable.get()).aa(adhaVar.a.d(0))));
        }
        return ((Boolean) optionalOfNullable.orElse(Boolean.FALSE)).booleanValue();
    }

    public final void b() {
        List arrayList;
        Optional optional = (Optional) this.g.get();
        if (optional == null || optional.isEmpty()) {
            return;
        }
        List list = this.c;
        ArrayList arrayList2 = new ArrayList(list);
        afyx afyxVar = (afyx) optional.get();
        if (!this.b || this.d > 1) {
            int i = this.d;
            apkx apkxVar = this.e;
            ascp ascpVarH = i <= 1 ? H(1, apkxVar) : H(i, apkxVar);
            InstanceProxy instanceProxyD = afyxVar.d();
            if (instanceProxyD instanceof afyy) {
                agcv agcvVar = ((afyy) instanceProxyD).a;
            }
            ascq ascqVar = ascq.a;
            arrayList = ((ascq) afyxVar.f(658480404, ascpVarH, aihn.getParserForClass(ascq.class))).b;
        } else {
            List list2 = this.f;
            arrayList = new ArrayList(list2.size());
            for (int i2 = 0; i2 < list2.size(); i2++) {
                aihf aihfVarCreateBuilder = ascn.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                ascn ascnVar = (ascn) aihfVarCreateBuilder.instance;
                ascnVar.b |= 1;
                ascnVar.c = i2;
                boolean zG = G(((adlo) list2.get(i2)).a);
                aihfVarCreateBuilder.copyOnWrite();
                ascn ascnVar2 = (ascn) aihfVarCreateBuilder.instance;
                ascnVar2.b |= 2;
                ascnVar2.d = zG;
                arrayList.add((ascn) aihfVarCreateBuilder.build());
            }
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            adlo adloVar = (adlo) this.f.get(((ascn) arrayList.get(i3)).c);
            if (list.get(i3) != adloVar) {
                Collections.swap(list, i3, list.indexOf(adloVar));
            }
        }
        if (list.equals(arrayList2)) {
            return;
        }
        o();
        r();
        int i4 = -1;
        for (int i5 = 0; i5 < list.size(); i5++) {
            if (list.get(i5) == arrayList2.get(i5)) {
                if (i4 != -1) {
                    I(i4, i5 - 1);
                }
                i4 = -1;
            } else if (i4 == -1) {
                i4 = i5;
            }
        }
        if (i4 != -1) {
            I(i4, list.size() - 1);
        }
    }

    @Override // defpackage.adlq
    protected final adlp n(int i, adkz adkzVar, boolean z) {
        int i2;
        taq.d();
        adlo adloVarU = u(adkzVar, i);
        if (this.j && this.l && (i2 = this.k) != -1) {
            this.f.add(i2, adloVarU);
        } else {
            this.f.add(i, adloVarU);
        }
        r();
        adkz adkzVar2 = adloVarU.a;
        if (adkzVar2.isEmpty()) {
            return null;
        }
        if (!z) {
            return new adlp(adloVarU.b, adkzVar2.a());
        }
        z(adloVarU.b, adkzVar2.a());
        b();
        return null;
    }

    @Override // defpackage.adlq
    public final void p(List list) {
        super.p(list);
        r();
        b();
    }

    @Override // defpackage.adlq
    public final void q(adkz adkzVar) {
        super.q(adkzVar);
        List list = this.f;
        int size = list.size();
        do {
            size--;
            if (size >= 0) {
            }
            r();
            b();
        } while (((adlo) list.get(size)).a != adkzVar);
        list.remove(size);
        r();
        b();
    }

    @Override // defpackage.adlq
    public final boolean s(int i, int i2) {
        taq.d();
        List list = this.c;
        if (list.isEmpty() || i > i2 || i2 >= list.size()) {
            return false;
        }
        for (int i3 = i2; i3 >= i; i3--) {
            this.f.remove(list.get(i3));
        }
        boolean zS = super.s(i, i2);
        b();
        return zS;
    }

    @Override // defpackage.adlq
    public final boolean t() {
        if (this.i) {
            this.d = 1;
            this.e = apkx.a;
        }
        this.f.clear();
        return super.t();
    }
}
