package defpackage;

import android.os.Bundle;
import android.util.Pair;
import app.rive.semantics.SemanticState;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.io.File;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xwd implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ xwd(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x039f  */
    /* JADX WARN: Type inference failed for: r11v35, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, java.util.Map$Entry] */
    @Override // defpackage.agek
    public final Object apply(Object obj) {
        Object pair;
        Object obj2;
        int i = -1;
        switch (this.$cid) {
            case 0:
                atpd atpdVar = (atpd) obj;
                aihf aihfVarCreateBuilder = atpdVar == null ? atpd.a.createBuilder() : atpdVar.toBuilder();
                Object obj3 = this.a;
                aihfVarCreateBuilder.copyOnWrite();
                atpd atpdVar2 = (atpd) aihfVarCreateBuilder.instance;
                obj3.getClass();
                atpdVar2.b |= 1;
                atpdVar2.c = (String) obj3;
                return (atpd) aihfVarCreateBuilder.build();
            case 1:
                pair = new Pair((dii) this.a.getKey(), (Optional) obj);
                return pair;
            case 2:
                ainm ainmVar = (ainm) obj;
                agjz agjzVar = new agjz(4);
                xvk xvkVar = (xvk) this.a;
                for (xvo xvoVar : xvkVar.a.f) {
                    aihf aihfVarCreateBuilder2 = ainn.a.createBuilder();
                    String strName = xvoVar.b.name();
                    aihfVarCreateBuilder2.copyOnWrite();
                    ainn ainnVar = (ainn) aihfVarCreateBuilder2.instance;
                    strName.getClass();
                    ainnVar.b |= 1;
                    ainnVar.c = strName;
                    String str = xvoVar.c;
                    aihfVarCreateBuilder2.copyOnWrite();
                    ainn ainnVar2 = (ainn) aihfVarCreateBuilder2.instance;
                    ainnVar2.b |= 2;
                    ainnVar2.d = str;
                    agjzVar.h((ainn) aihfVarCreateBuilder2.build());
                }
                aihf builder = ainmVar.toBuilder();
                aihf aihfVarCreateBuilder3 = ainl.a.createBuilder();
                String str2 = xvkVar.b().b;
                aihfVarCreateBuilder3.copyOnWrite();
                ainl ainlVar = (ainl) aihfVarCreateBuilder3.instance;
                ainlVar.b |= 1;
                ainlVar.c = str2;
                String strL = xvkVar.l();
                aihfVarCreateBuilder3.copyOnWrite();
                ainl ainlVar2 = (ainl) aihfVarCreateBuilder3.instance;
                ainlVar2.b |= 2;
                ainlVar2.d = strL;
                String str3 = xvkVar.k().b;
                aihfVarCreateBuilder3.copyOnWrite();
                ainl ainlVar3 = (ainl) aihfVarCreateBuilder3.instance;
                ainlVar3.b |= 4;
                ainlVar3.e = str3;
                boolean z = xvkVar.b;
                aihfVarCreateBuilder3.copyOnWrite();
                ainl ainlVar4 = (ainl) aihfVarCreateBuilder3.instance;
                ainlVar4.b |= 8;
                ainlVar4.f = z;
                agke agkeVarG = agjzVar.g();
                aihfVarCreateBuilder3.copyOnWrite();
                ainl ainlVar5 = (ainl) aihfVarCreateBuilder3.instance;
                aiie aiieVar = ainlVar5.g;
                if (!aiieVar.c()) {
                    ainlVar5.g = aihn.mutableCopy(aiieVar);
                }
                aifs.addAll(agkeVarG, ainlVar5.g);
                ainl ainlVar6 = (ainl) aihfVarCreateBuilder3.build();
                builder.copyOnWrite();
                ainm ainmVar2 = (ainm) builder.instance;
                ainlVar6.getClass();
                ainmVar2.a();
                ainmVar2.b.add(0, ainlVar6);
                if (((ainm) builder.instance).b.size() > 5) {
                    builder.aB(((ainm) builder.instance).b.size() - 1);
                }
                return (ainm) builder.build();
            case 3:
                aihf builder2 = ((ainm) obj).toBuilder();
                for (int i2 = 0; i2 < ((ainm) builder2.instance).b.size(); i2++) {
                    if (((ainl) ((ainm) builder2.instance).b.get(i2)).c.equals(((xwc) this.a).b)) {
                        i = i2;
                        if (i >= 0) {
                            builder2.aB(i);
                        }
                        return (ainm) builder2.build();
                    }
                }
                if (i >= 0) {
                    builder2.aB(i);
                }
                return (ainm) builder2.build();
            case 4:
                aihf aihfVarCreateBuilder4 = atpe.a.createBuilder();
                aihfVarCreateBuilder4.copyOnWrite();
                atpe atpeVar = (atpe) aihfVarCreateBuilder4.instance;
                atpeVar.b |= 1;
                xze xzeVar = (xze) this.a;
                int i3 = xzeVar.k;
                atpeVar.c = i3 - 1;
                aihfVarCreateBuilder4.copyOnWrite();
                atpe atpeVar2 = (atpe) aihfVarCreateBuilder4.instance;
                atpeVar2.b |= SemanticState.Focused;
                atpeVar2.h = xzeVar.d;
                aihfVarCreateBuilder4.copyOnWrite();
                atpe atpeVar3 = (atpe) aihfVarCreateBuilder4.instance;
                atpeVar3.b |= 32;
                atpeVar3.g = xzeVar.c;
                aihfVarCreateBuilder4.copyOnWrite();
                atpe atpeVar4 = (atpe) aihfVarCreateBuilder4.instance;
                atpeVar4.b |= SemanticState.Hidden;
                atpeVar4.i = xzeVar.a;
                aihfVarCreateBuilder4.copyOnWrite();
                atpe atpeVar5 = (atpe) aihfVarCreateBuilder4.instance;
                atpeVar5.b |= SemanticState.LiveRegion;
                atpeVar5.j = xzeVar.e;
                long jA = xzeVar.a();
                aihfVarCreateBuilder4.copyOnWrite();
                atpe atpeVar6 = (atpe) aihfVarCreateBuilder4.instance;
                atpeVar6.b |= SemanticState.ReadOnly;
                atpeVar6.k = jA;
                aihfVarCreateBuilder4.copyOnWrite();
                atpe atpeVar7 = (atpe) aihfVarCreateBuilder4.instance;
                atpeVar7.b |= SemanticState.Multiline;
                atpeVar7.n = xzeVar.f.E;
                Optional optional = xzeVar.h;
                if (optional.isPresent()) {
                    xyi xyiVar = (xyi) optional.get();
                    long jA2 = xyiVar.a();
                    aihfVarCreateBuilder4.copyOnWrite();
                    atpe atpeVar8 = (atpe) aihfVarCreateBuilder4.instance;
                    atpeVar8.b |= SemanticState.Modal;
                    atpeVar8.l = jA2;
                    long jB = xyiVar.b();
                    aihfVarCreateBuilder4.copyOnWrite();
                    atpe atpeVar9 = (atpe) aihfVarCreateBuilder4.instance;
                    atpeVar9.b |= 4;
                    atpeVar9.e = jB;
                    long jC = xyiVar.a ? -2L : xyiVar.c();
                    aihfVarCreateBuilder4.copyOnWrite();
                    atpe atpeVar10 = (atpe) aihfVarCreateBuilder4.instance;
                    atpeVar10.b |= 8;
                    atpeVar10.f = jC;
                } else {
                    aihfVarCreateBuilder4.copyOnWrite();
                    atpe atpeVar11 = (atpe) aihfVarCreateBuilder4.instance;
                    atpeVar11.b |= SemanticState.Modal;
                    atpeVar11.l = -1L;
                    aihfVarCreateBuilder4.copyOnWrite();
                    atpe atpeVar12 = (atpe) aihfVarCreateBuilder4.instance;
                    atpeVar12.b |= 4;
                    atpeVar12.e = -1L;
                    aihfVarCreateBuilder4.copyOnWrite();
                    atpe atpeVar13 = (atpe) aihfVarCreateBuilder4.instance;
                    atpeVar13.b |= 8;
                    atpeVar13.f = -1L;
                }
                Optional optional2 = xzeVar.i;
                if (optional2.isPresent()) {
                    int i4 = ((amyu) optional2.get()).aa;
                    aihfVarCreateBuilder4.copyOnWrite();
                    atpe atpeVar14 = (atpe) aihfVarCreateBuilder4.instance;
                    atpeVar14.b |= 2;
                    atpeVar14.d = i4;
                } else {
                    aihfVarCreateBuilder4.copyOnWrite();
                    atpe atpeVar15 = (atpe) aihfVarCreateBuilder4.instance;
                    atpeVar15.b |= 2;
                    atpeVar15.d = -1;
                }
                if (i3 == 3) {
                    xyj xyjVar = xzeVar.g;
                    xyjVar.getClass();
                    aihfVarCreateBuilder4.copyOnWrite();
                    atpe atpeVar16 = (atpe) aihfVarCreateBuilder4.instance;
                    atpeVar16.b |= SemanticState.Obscured;
                    atpeVar16.m = xyjVar.a.b;
                }
                return (atpe) aihfVarCreateBuilder4.build();
            case 5:
                return this.a;
            case 6:
                aihf builder3 = ((atpl) obj).toBuilder();
                aihf aihfVarCreateBuilder5 = zig.a.createBuilder();
                aihfVarCreateBuilder5.copyOnWrite();
                zig zigVar = (zig) aihfVarCreateBuilder5.instance;
                aiie aiieVar2 = zigVar.b;
                if (!aiieVar2.c()) {
                    zigVar.b = aihn.mutableCopy(aiieVar2);
                }
                aifs.addAll(this.a, zigVar.b);
                zig zigVar2 = (zig) aihfVarCreateBuilder5.build();
                builder3.copyOnWrite();
                atpl atplVar = (atpl) builder3.instance;
                zigVar2.getClass();
                atplVar.e = zigVar2;
                atplVar.b |= 2;
                return (atpl) builder3.build();
            case 7:
                int i5 = zjr.L;
                aihf builder4 = ((atpl) obj).toBuilder();
                builder4.copyOnWrite();
                ((atpl) builder4.instance).c().clear();
                builder4.copyOnWrite();
                ((atpl) builder4.instance).b().clear();
                builder4.copyOnWrite();
                atpl atplVar2 = (atpl) builder4.instance;
                atplVar2.b |= SemanticState.Hidden;
                atplVar2.l = (String) this.a;
                return (atpl) builder4.build();
            case 8:
                vxz vxzVar = ((zkd) this.a).l;
                atpl atplVar3 = (atpl) obj;
                int iC = (int) vxzVar.c(2, 45375003L, 0L);
                if (atplVar3.q >= iC) {
                    return atplVar3;
                }
                aihf builder5 = atplVar3.toBuilder();
                builder5.copyOnWrite();
                atpl atplVar4 = (atpl) builder5.instance;
                atplVar4.b |= SemanticState.Multiline;
                atplVar4.q = iC;
                builder5.copyOnWrite();
                ((atpl) builder5.instance).a().clear();
                builder5.copyOnWrite();
                atpl atplVar5 = (atpl) builder5.instance;
                atplVar5.b &= -9;
                atplVar5.g = atpl.a.g;
                builder5.copyOnWrite();
                atpl atplVar6 = (atpl) builder5.instance;
                atplVar6.o = null;
                atplVar6.b &= -2049;
                builder5.copyOnWrite();
                atpl atplVar7 = (atpl) builder5.instance;
                atplVar7.p = null;
                atplVar7.b &= -4097;
                return (atpl) builder5.build();
            case 9:
                Bundle bundle = new Bundle();
                bundle.putString("renderer_class_name", this.a.getClass().getName());
                bundle.putString("unique_payload_id", (String) obj);
                pair = bundle;
                return pair;
            case 10:
                ((syn) ((aaok) this.a).a).d("notification_processing", 0L, 1, 0, false, (Bundle) obj, null, false);
                return Boolean.TRUE;
            case 11:
                byte[] bArr = (byte[]) obj;
                Object obj4 = this.a;
                if (bArr == null || bArr.length == 0) {
                    ((zzx) obj4).g.b("Downloaded bytes are null or empty.", null);
                    return zzx.c;
                }
                String string = UUID.randomUUID().toString();
                zzx zzxVar = (zzx) obj4;
                syw sywVar = zzxVar.e;
                if (sywVar.a(string, bArr)) {
                    return new File(sywVar.b, string);
                }
                zzxVar.g.b("Failed to write media to cache.", null);
                return zzx.c;
            case 12:
                obj2 = (awmy) obj;
                ((elr) ((abqq) this.a).e).q(aaan.SUCCESS);
                return obj2;
            case 13:
                return ((elr) this.a).r((ozi) obj);
            case 14:
                aihf builder6 = ((atpq) obj).toBuilder();
                builder6.copyOnWrite();
                atpq atpqVar = (atpq) builder6.instance;
                Object obj5 = this.a;
                obj5.getClass();
                atpqVar.b |= 4;
                atpqVar.e = (String) obj5;
                return (atpq) builder6.build();
            case 15:
                return this.a;
            case 16:
                return this.a;
            case 17:
                Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(((axsu) obj).b);
                Object obj6 = this.a;
                obj2 = (aigj) mapUnmodifiableMap.get(obj6);
                if (obj2 == null) {
                    throw new IllegalArgumentException(String.format("%s payload id is not found", obj6));
                }
                return obj2;
            case 18:
                aihf builder7 = ((axsu) obj).toBuilder();
                builder7.copyOnWrite();
                ((axsu) builder7.instance).a().remove(this.a);
                return (axsu) builder7.build();
            case 19:
                return this.a;
            default:
                return Long.valueOf(((aaew) ((aadk) this.a).i.io()).ag((String) obj));
        }
    }
}
