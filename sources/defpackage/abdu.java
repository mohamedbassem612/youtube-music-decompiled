package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abdu implements abdx {
    private static final agkj c = agkj.m(abnw.a, abdy.a, abnw.b, abdy.b, abnw.d, abdy.c, abnw.e, abdy.d);
    public final abdi a;
    public abdq b;

    public abdu(abdi abdiVar) {
        this.a = abdiVar;
    }

    @Override // defpackage.abdx
    public final void a() {
        abdq abdqVar = this.b;
        if (abdqVar != null) {
            Optional optionalA = abdqVar.c().a();
            yyk yykVar = new yyk(this, 14);
            if (true == optionalA.isPresent()) {
                Object obj = optionalA.get();
                abdu abduVar = (abdu) yykVar.a;
                ajwo ajwoVarD = abduVar.b.d();
                abduVar.a.h((xhy) obj, ajwoVarD, null);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0030  */
    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    /* JADX WARN: Code duplicated, block: B:24:0x006d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    @Override // defpackage.abdx
    public final void b(aayw aaywVar) {
        abdq abdqVar;
        abdr abdrVarA;
        Optional optionalOf;
        abdy abdyVar = (abdy) c.get(aaywVar.b);
        if (abdyVar != null) {
            ajwo ajwoVar = aaywVar.e;
            abdq abdqVar2 = this.b;
            if (abdqVar2 == null) {
                abdqVar = this.b;
                if (abdqVar == null) {
                    abdrVarA = new abdr((xhy) null, (ajwo) null, ajwoVar, 0);
                } else {
                    abdrVarA = abdqVar.a(ajwoVar);
                }
                optionalOf = Optional.of(abdrVarA);
            } else if (abdqVar2.d() != null || ajwoVar != null) {
                if (abdqVar2.d() != null && ajwoVar != null) {
                    ajwo ajwoVarD = abdqVar2.d();
                    ajwoVarD.getClass();
                    if (abnn.j(ajwoVarD, ajwoVar)) {
                        if (abdyVar == abdy.a) {
                            if (this.b.b().a(abdyVar) || !(abdyVar == abdy.c || abdyVar == abdy.d)) {
                                optionalOf = this.b.e(aaywVar);
                            } else {
                                optionalOf = Optional.of(new abdn((xhy) this.b.c().a().orElse(null), aaywVar.c, ajwoVar, aaywVar.f));
                            }
                        }
                    }
                }
                abdqVar = this.b;
                if (abdqVar == null) {
                    abdrVarA = new abdr((xhy) null, (ajwo) null, ajwoVar, 0);
                } else {
                    abdrVarA = abdqVar.a(ajwoVar);
                }
                optionalOf = Optional.of(abdrVarA);
            } else if (abdyVar == abdy.a) {
                abdqVar = this.b;
                if (abdqVar == null) {
                    abdrVarA = new abdr((xhy) null, (ajwo) null, ajwoVar, 0);
                } else {
                    abdrVarA = abdqVar.a(ajwoVar);
                }
                optionalOf = Optional.of(abdrVarA);
            } else if (this.b.b().a(abdyVar)) {
                optionalOf = this.b.e(aaywVar);
            } else {
                optionalOf = this.b.e(aaywVar);
            }
            if (optionalOf.isPresent()) {
                abdp abdpVar = (abdp) optionalOf.get();
                if (abdyVar.a(abdpVar.b())) {
                    abdi abdiVar = this.a;
                    abdq abdqVarA = abdpVar.a(abdiVar);
                    while (abdyVar != abdqVarA.b()) {
                        Optional optionalE = abdqVarA.e(aaywVar);
                        if (!optionalE.isPresent()) {
                            break;
                        } else {
                            abdqVarA = ((abdp) optionalE.get()).a(abdiVar);
                        }
                    }
                    this.b = abdqVarA;
                }
            }
        }
    }
}
