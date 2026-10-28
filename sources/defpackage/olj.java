package defpackage;

import android.net.Uri;
import app.rive.semantics.SemanticState;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class olj implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ olj(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.agek
    public final Object apply(Object obj) {
        switch (this.$cid) {
            case 0:
                agkh agkhVar = new agkh(4);
                agqr it = ((agkj) obj).entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    oin oinVar = (oin) entry.getKey();
                    if (entry.getValue() != null) {
                        if ((oinVar.b & SemanticState.Hidden) != 0) {
                            Uri uriBuild = (Uri) entry.getValue();
                            atyn atynVar = oinVar.k;
                            if (atynVar == null) {
                                atynVar = atyn.a;
                            }
                            ((olp) this.a).i.j();
                            if (atynVar.b.size() != 0) {
                                uriBuild = uriBuild.buildUpon().encodedFragment(qra.a(atynVar)).build();
                            }
                            agkhVar.e(oinVar, uriBuild);
                        } else {
                            agkhVar.f(entry);
                        }
                    }
                }
                return agkhVar.d(false);
            case 1:
                return Boolean.valueOf(((Boolean) obj).booleanValue() && ((Boolean) this.a).booleanValue());
            case 2:
                aihf builder = ((oiu) obj).toBuilder();
                builder.copyOnWrite();
                oiu oiuVar = (oiu) builder.instance;
                aiie aiieVar = oiuVar.d;
                if (!aiieVar.c()) {
                    oiuVar.d = aihn.mutableCopy(aiieVar);
                }
                aifs.addAll(this.a, oiuVar.d);
                return (oiu) builder.build();
            case 3:
                return (oix) DesugarCollections.unmodifiableMap(((oiu) obj).c).get(this.a);
            case 4:
                aihf builder2 = ((oiu) obj).toBuilder();
                for (oiw oiwVar : this.a) {
                    String str = oiwVar.c;
                    String str2 = oiwVar.d;
                    int i = onb.a;
                    builder2.V(qnl.aZ(oiwVar));
                }
                return (oiu) builder2.build();
            case 5:
                return this.a;
            case 6:
                return (oip) DesugarCollections.unmodifiableMap(((oiu) obj).b).get(this.a);
            case 7:
                aihf builder3 = ((oiu) obj).toBuilder();
                builder3.V((String) this.a);
                return (oiu) builder3.build();
            case 8:
                oiu oiuVar2 = (oiu) obj;
                aihf builder4 = oiuVar2.toBuilder();
                ?? r9 = this.a;
                for (Map.Entry entry2 : DesugarCollections.unmodifiableMap(oiuVar2.b).entrySet()) {
                    String str3 = (String) entry2.getKey();
                    try {
                        r9.add(new omh(qnl.aX(str3), (oip) entry2.getValue()));
                    } catch (onv e) {
                        builder4.V(str3);
                        onb.f(e, "Failed to deserialized file group key: ".concat(String.valueOf(str3)));
                    }
                }
                return (oiu) builder4.build();
            case 9:
                return this.a;
            case 10:
                onb.b("Failed to commit migration metadata to disk");
                new Exception("Migration to DownloadTransform failed.", (IOException) obj);
                return Boolean.FALSE;
            case 11:
                return (ojb) ((agkj) obj).get(this.a);
            case 12:
                aihf builder5 = ((ojc) obj).toBuilder();
                builder5.X((String) this.a);
                return (ojc) builder5.build();
            case 13:
                ojc ojcVar = (ojc) obj;
                int i2 = onb.a;
                aihf builder6 = ojcVar.toBuilder();
                Object obj2 = this.a;
                for (String str4 : DesugarCollections.unmodifiableMap(ojcVar.b).keySet()) {
                    try {
                        oiz oizVarC = nst.c(str4, ((olt) obj2).a, ((olt) obj2).b);
                        str4.getClass();
                        ojb ojbVar = (ojb) ojcVar.b.get(str4);
                        if (ojbVar == null) {
                            ojbVar = null;
                        }
                        builder6.X(str4);
                        if (ojbVar == null) {
                            onb.c("%s: Unable to read sharedFile from ProtoDataStore.", "ProtoDataStoreSharedFilesMetadata");
                        } else {
                            builder6.W(nst.a(oizVarC), ojbVar);
                        }
                    } catch (onx unused) {
                        onb.d("%s Failed to deserialize file key %s, remove and continue.", "ProtoDataStoreSharedFilesMetadata", str4);
                        builder6.X(str4);
                    }
                }
                return (ojc) builder6.build();
            case 14:
                onb.b("Failed to commit migration metadata to disk");
                new Exception("Migration to ChecksumOnly failed.", (IOException) obj);
                return Boolean.FALSE;
            case 15:
                return (List) ((AtomicReference) this.a).get();
            case 16:
                ojc ojcVar2 = (ojc) obj;
                int i3 = onb.a;
                aihf builder7 = ojcVar2.toBuilder();
                Object obj3 = this.a;
                for (String str5 : DesugarCollections.unmodifiableMap(ojcVar2.b).keySet()) {
                    try {
                        oiz oizVarC2 = nst.c(str5, ((olt) obj3).a, ((olt) obj3).b);
                        str5.getClass();
                        ojb ojbVar2 = (ojb) ojcVar2.b.get(str5);
                        if (ojbVar2 == null) {
                            ojbVar2 = null;
                        }
                        builder7.X(str5);
                        if (ojbVar2 == null) {
                            onb.c("%s: Unable to read sharedFile from ProtoDataStore.", "ProtoDataStoreSharedFilesMetadata");
                        } else {
                            builder7.W(nst.b(oizVarC2), ojbVar2);
                        }
                    } catch (onx unused2) {
                        onb.d("%s Failed to deserialize file key %s, remove and continue.", "ProtoDataStoreSharedFilesMetadata", str5);
                        builder7.X(str5);
                    }
                }
                return (ojc) builder7.build();
            case 17:
                return (Uri) ((agkj) obj).get(this.a);
            case 18:
                return (ojb) ((agkj) obj).get(this.a);
            case 19:
                return new omy((ahap) obj, (ahai) this.a);
            default:
                okz okzVar = (okz) obj;
                Object obj4 = this.a;
                if (okzVar == okz.b || okzVar == okz.a) {
                    aihf aihfVar = (aihf) obj4;
                    aihfVar.copyOnWrite();
                    ahap ahapVar = (ahap) aihfVar.instance;
                    ahap ahapVar2 = ahap.a;
                    ahapVar.c = 2;
                    ahapVar.b |= 1;
                } else {
                    aihf aihfVar2 = (aihf) obj4;
                    aihfVar2.copyOnWrite();
                    ahap ahapVar3 = (ahap) aihfVar2.instance;
                    ahap ahapVar4 = ahap.a;
                    ahapVar3.c = 3;
                    ahapVar3.b |= 1;
                }
                return (ahap) ((aihf) obj4).build();
        }
    }
}
