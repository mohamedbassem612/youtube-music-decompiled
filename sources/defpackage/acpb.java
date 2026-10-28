package defpackage;

import android.content.Context;
import com.google.android.libraries.elements.interfaces.ResourceLoader;
import j$.util.OptionalInt;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class acpb implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ acpb(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r6v52, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.agek
    public final Object apply(Object obj) {
        switch (this.$cid) {
            case 0:
                acuy acuyVar = (acuy) obj;
                acpc acpcVar = (acpc) this.a;
                String str = acpcVar.f;
                acuz acuzVar = acuz.a;
                str.getClass();
                acuz acuzVar2 = (acuz) acuyVar.b.get(str);
                if (acuzVar2 != null) {
                    acuzVar = acuzVar2;
                }
                aihf builder = acuzVar.toBuilder();
                int i = acpcVar.d;
                builder.copyOnWrite();
                ((acuz) builder.instance).d = i;
                String str2 = acpcVar.b;
                builder.copyOnWrite();
                acuz acuzVar3 = (acuz) builder.instance;
                str2.getClass();
                acuzVar3.e = str2;
                acuz acuzVar4 = (acuz) builder.build();
                aihf builder2 = acuyVar.toBuilder();
                builder2.ag(acpcVar.f);
                builder2.af(acpcVar.f, acuzVar4);
                return (acuy) builder2.build();
            case 1:
                acpc acpcVar2 = (acpc) this.a;
                String str3 = acpcVar2.f;
                acuz acuzVar5 = acuz.a;
                str3.getClass();
                acuz acuzVar6 = (acuz) ((acuy) obj).b.get(str3);
                if (acuzVar6 != null) {
                    acuzVar5 = acuzVar6;
                }
                if (acpcVar2.b.equals(acuzVar5.e)) {
                    acpcVar2.e = acuzVar5.c;
                    acpcVar2.d = acuzVar5.d;
                    acpcVar2.c = acuzVar5.b;
                } else {
                    acpcVar2.e = 0;
                    acpcVar2.d = 0;
                }
                acpcVar2.c = acuzVar5.b;
                return null;
            case 2:
                aihf builder3 = ((acuy) obj).toBuilder();
                builder3.af("shorts", (acuz) this.a);
                return (acuy) builder3.build();
            case 3:
                return aigj.v(((ResourceLoader) obj).getLimitedServingContext(((OptionalInt) this.a).getAsInt()));
            case 4:
                ((aczd) this.a).e((ResourceLoader) obj);
                return null;
            case 5:
                return ((aczd) this.a).a();
            case 6:
                return aigj.v(((ResourceLoader) obj).getLimitedServingContext(((OptionalInt) this.a).getAsInt()));
            case 7:
                return (aigj) ((AtomicReference) ((aczd) this.a).d).get();
            case 8:
                return ((adak) this.a).b();
            case 9:
                return Integer.valueOf(twm.c(((adlm) this.a).b, ((Integer) obj).intValue()));
            case 10:
                return Integer.valueOf((int) twm.a(((adlm) this.a).b, ((Float) obj).floatValue()));
            case 11:
                return Integer.valueOf((int) twm.a(((adlm) this.a).b, ((Float) obj).floatValue()));
            case 12:
                return ((adys) this.a).i((anfv) obj);
            case 13:
                ainr ainrVar = (ainr) obj;
                Object obj2 = this.a;
                int i2 = aebx.f;
                HashSet hashSet = new HashSet(ainrVar.b);
                Collections.addAll(hashSet, (Object[]) obj2);
                aihf builder4 = ainrVar.toBuilder();
                builder4.copyOnWrite();
                ((ainr) builder4.instance).b = ainr.emptyProtobufList();
                builder4.aC(hashSet);
                return (ainr) builder4.build();
            case 14:
                return this.a;
            case 15:
                return this.a;
            case 16:
                return ((aeix) aguu.aw((Context) ((axlj) this.a).a, aeix.class, (affd) obj)).n();
            case 17:
                Object obj3 = this.a;
                obj3.getClass();
                String str4 = (String) ((arkk) obj).b.get(obj3);
                if (str4 != null) {
                    return str4;
                }
                return null;
            case 18:
                aeje aejeVar = (aeje) obj;
                aihf builder5 = aejeVar.toBuilder();
                aejf aejfVar = aejeVar.c;
                if (aejfVar == null) {
                    aejfVar = aejf.a;
                }
                Object obj4 = this.a;
                aihf builder6 = aejfVar.toBuilder();
                builder6.copyOnWrite();
                aejf aejfVar2 = (aejf) builder6.instance;
                obj4.getClass();
                aejfVar2.b |= 1;
                aejfVar2.c = (String) obj4;
                builder5.copyOnWrite();
                aeje aejeVar2 = (aeje) builder5.instance;
                aejf aejfVar3 = (aejf) builder6.build();
                aejfVar3.getClass();
                aejeVar2.c = aejfVar3;
                aejeVar2.b |= 1;
                return (aeje) builder5.build();
            case 19:
                byte[] bArr = (byte[]) obj;
                Object obj5 = this.a;
                if (bArr == null) {
                    throw new aeon("Could not find any value for: ".concat(obj5.toString()));
                }
                try {
                    return aejd.a(bArr);
                } catch (IOException e) {
                    throw new IllegalArgumentException("An error occurred while unmarshalling the value for".concat(obj5.toString()), e);
                }
            default:
                axlj axljVar = (axlj) this.a;
                axljVar.b.b();
                Object obj6 = axljVar.a;
                aciz acizVar = new aciz(obj6, (alxg) obj);
                agqs agqsVarListIterator = ((agke) axljVar.c).listIterator(0);
                while (agqsVarListIterator.hasNext()) {
                    ((ahub) agqsVarListIterator.next()).a.put(obj6, new aciz(acizVar.b, acizVar.a));
                }
                return acizVar;
        }
    }
}
