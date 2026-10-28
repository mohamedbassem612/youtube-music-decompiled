package defpackage;

import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pte implements awqg {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [dpb] */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4, types: [dpb] */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r1v1, types: [dpb] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [dpb] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // defpackage.awqg
    public final Object invoke(Object obj) throws Throwable {
        ?? M;
        aifv aifvVar;
        ?? A = ((dpt) obj).a("SELECT * FROM threads");
        try {
            int iM = ape.m(A, "id");
            int iM2 = ape.m(A, "thread_id");
            int iM3 = ape.m(A, "read_state");
            int iM4 = ape.m(A, "deletion_status");
            int iM5 = ape.m(A, "count_behavior");
            int iM6 = ape.m(A, "system_tray_behavior");
            int iM7 = ape.m(A, "last_updated_version");
            int iM8 = ape.m(A, "last_notification_version");
            int iM9 = ape.m(A, "creation_id");
            int iM10 = ape.m(A, "payload_type");
            int iM11 = ape.m(A, "payload");
            int iM12 = ape.m(A, "insertion_time_ms");
            int iM13 = ape.m(A, "storage_mode");
            int iM14 = ape.m(A, "opaque_backend_data");
            int iM15 = ape.m(A, "thread_type");
            int iM16 = ape.m(A, "type_specific_data");
            M = ape.m(A, "external_experiment_ids");
            int iM17 = ape.m(A, "rendering_metadata");
            int iM18 = ape.m(A, "send_timestamp_usec");
            int iM19 = ape.m(A, "notification_type");
            ArrayList arrayList = new ArrayList();
            A = A;
            while (A.l()) {
                int i = iM14;
                ArrayList arrayList2 = arrayList;
                int iB = (int) A.b(iM);
                String strD = A.d(iM2);
                int iB2 = aiep.b((int) A.b(iM3));
                if (iB2 == 0) {
                    iB2 = aiep.a;
                }
                int i2 = iB2;
                aidu aiduVarA = aidu.a((int) A.b(iM4));
                if (aiduVarA == null) {
                    aiduVarA = aidu.DELETION_STATUS_UNKNOWN;
                }
                aidu aiduVar = aiduVarA;
                int iAS = a.aS((int) A.b(iM5));
                int i3 = iAS == 0 ? 1 : iAS;
                int iAS2 = a.aS((int) A.b(iM6));
                int i4 = iAS2 == 0 ? 1 : iAS2;
                long jB = A.b(iM7);
                long jB2 = A.b(iM8);
                long jB3 = A.b(iM9);
                String strD2 = A.k(iM10) ? null : A.d(iM10);
                byte[] bArrM = A.k(iM11) ? null : A.m(iM11);
                if (bArrM == null) {
                    aifvVar = null;
                } else {
                    aifv aifvVar2 = aifv.a;
                    aifvVar2.getClass();
                    try {
                        MessageLite messageLiteBuild = aifvVar2.toBuilder().mergeFrom(bArrM).build();
                        messageLiteBuild.getClass();
                        aifvVar = (aifv) messageLiteBuild;
                    } catch (aiik e) {
                        throw new RuntimeException(e);
                    }
                }
                long jB4 = A.b(iM12);
                aifv aifvVar3 = aifvVar;
                int iAS3 = a.aS((int) A.b(iM13));
                int i5 = iAS3 == 0 ? 1 : iAS3;
                aigj aigjVarA = nxn.a(A.m(i));
                int i6 = iM15;
                int i7 = iM4;
                int i8 = iM5;
                int iB3 = (int) A.b(i6);
                awnb awnbVar = new awnb((awne) pti.c);
                boolean z = false;
                Object obj2 = null;
                while (awnbVar.hasNext()) {
                    Object next = awnbVar.next();
                    iM = iM;
                    if (((pti) next).d == iB3) {
                        if (z) {
                            throw new IllegalArgumentException("Collection contains more than one matching element.");
                        }
                        obj2 = next;
                        z = true;
                        M.close();
                        throw th;
                    }
                }
                int i9 = iM;
                if (!z) {
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                pti ptiVar = (pti) obj2;
                int i10 = iM16;
                aigj aigjVarA2 = nxn.a(A.m(i10));
                ?? r4 = M;
                int i11 = iM17;
                int i12 = iM18;
                iM16 = i10;
                int i13 = iM19;
                iM19 = i13;
                M = A;
                try {
                    arrayList2.add(new pth(iB, strD, i2, aiduVar, i3, i4, jB, jB2, jB3, strD2, aifvVar3, jB4, i5, aigjVarA, ptiVar, aigjVarA2, A.d(r4 == true ? 1 : 0), nxn.a(A.m(i11)), A.b(i12), A.k(i13) ? null : A.d(i13)));
                    iM14 = i;
                    iM2 = iM2;
                    iM17 = i11;
                    iM18 = i12;
                    iM5 = i8;
                    iM = i9;
                    arrayList = arrayList2;
                    A = M;
                    M = r4 == true ? 1 : 0;
                    iM4 = i7;
                    iM15 = i6;
                    iM3 = iM3;
                } catch (Throwable th) {
                    th = th;
                }
            }
            ?? r16 = A;
            ArrayList arrayList3 = arrayList;
            r16.close();
            return arrayList3;
        } catch (Throwable th2) {
            th = th2;
            M = A;
        }
    }
}
