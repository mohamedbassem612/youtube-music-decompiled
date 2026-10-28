package defpackage;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Collection;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ist implements agek {
    private final /* synthetic */ int $cid;

    public /* synthetic */ ist(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0111  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5, types: [iti] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    @Override // defpackage.agek
    public final Object apply(Object obj) {
        ?? arrayList;
        jxd jxdVar;
        ByteBuffer byteBufferAsReadOnlyBuffer;
        aulf aulfVar;
        String str;
        itf itfVar;
        String[] strArr;
        byte[] bArr;
        Map map;
        Bundle[] bundleArr;
        Bundle[] bundleArr2;
        switch (this.$cid) {
            case 0:
                return 0;
            case 1:
                return 2;
            case 2:
                return 1;
            case 3:
                jxg jxgVar = (jxg) obj;
                if (jxgVar == null) {
                    return agpi.a;
                }
                arrayList = new ArrayList();
                jxf jxfVar = new jxf(jxgVar);
                while (jxfVar.hasNext()) {
                    jxe next = jxfVar.next();
                    jxg jxgVar2 = next.c;
                    int[] iArr = jxgVar2.h;
                    if (iArr == null) {
                        jxdVar = null;
                    } else {
                        Map[] mapArr = next.a.c;
                        if (mapArr != null) {
                            map = mapArr[iArr[next.b]];
                            if (map == null) {
                                map = new HashMap();
                            }
                            jxdVar = (jxd) map.get("thing_proto");
                        } else {
                            map = null;
                            jxdVar = null;
                        }
                        if (jxdVar == null && (bundleArr = jxgVar2.e) != null && (bundleArr2 = jxgVar2.f) != null) {
                            int i = next.b;
                            int[] intArray = bundleArr[iArr[i]].getIntArray("thing_proto");
                            byte[] byteArray = bundleArr2[iArr[i]].getByteArray("thing_proto");
                            if (intArray == null || byteArray == null) {
                                jxdVar = null;
                            } else {
                                jxdVar = new jxd(intArray, byteArray);
                                if (map != null) {
                                    map.put("thing_proto", jxdVar);
                                }
                            }
                        }
                    }
                    if (jxdVar == null) {
                        byteBufferAsReadOnlyBuffer = null;
                    } else {
                        jxdVar.a(next.b);
                        byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(jxdVar.d, jxdVar.b, jxdVar.c[jxdVar.a]).asReadOnlyBuffer();
                    }
                    if (byteBufferAsReadOnlyBuffer == null || !byteBufferAsReadOnlyBuffer.hasRemaining()) {
                        aulfVar = null;
                    } else {
                        try {
                            byte[] bArr2 = new byte[byteBufferAsReadOnlyBuffer.remaining()];
                            byteBufferAsReadOnlyBuffer.get(bArr2);
                            aulfVar = (aulf) aihn.parseFrom(aulf.a, bArr2);
                        } catch (aiik unused) {
                            aulfVar = null;
                        }
                    }
                    if (aulfVar != null) {
                        itfVar = itf.a(aulfVar);
                    } else {
                        jxf jxfVar2 = next.a;
                        if (jxfVar2.b != null) {
                            jxd jxdVar2 = jxfVar2.b;
                            jxdVar2.a(next.b);
                            str = new String(jxdVar2.d, jxdVar2.b, jxdVar2.c[jxdVar2.a], StandardCharsets.UTF_8);
                        } else {
                            jxg jxgVar3 = next.c;
                            int[] iArr2 = jxgVar3.b;
                            if (iArr2 == null || (bArr = jxgVar3.c) == null) {
                                str = null;
                            } else {
                                jxfVar2.b = new jxd(iArr2, bArr);
                                jxd jxdVar3 = jxfVar2.b;
                                jxdVar3.a(next.b);
                                str = new String(jxdVar3.d, jxdVar3.b, jxdVar3.c[jxdVar3.a], StandardCharsets.UTF_8);
                            }
                        }
                        jxg jxgVar4 = next.c;
                        int i2 = typ.a;
                        int[] iArr3 = jxgVar4.h;
                        String str2 = (iArr3 == null || (strArr = jxgVar4.i) == null) ? null : strArr[iArr3[next.b]];
                        itfVar = new itf(typ.c(str), typ.c(str2 == null ? null : str2.substring(str2.indexOf(45) + 1)));
                    }
                    arrayList.add(Uri.parse(itfVar.a));
                }
                break;
            case 4:
                agrf agrfVar = itq.a;
                arrayList = new iti((apoq) ((aihf) obj).build(), 2, (char[]) null);
                break;
            case 5:
                return (agke) Collection.EL.stream((agke) obj).map(new itm(7)).collect(aghu.a);
            case 6:
                return Boolean.FALSE;
            case 7:
                return agpi.a;
            case 8:
                Integer num = (Integer) obj;
                if (num.intValue() > 1) {
                    ((agrc) ((agrc) iuf.a.b().i(agso.a, "SideloadedStore")).k("com/google/android/apps/youtube/music/sideloaded/store/AsyncSideloadedStore", "deletePlaylistFromMediaStore", 1436, "AsyncSideloadedStore.java")).w("deletePlaylist deleted %d rows", num);
                }
                return Boolean.valueOf(num.intValue() > 0);
            case 9:
                return Boolean.FALSE;
            case 10:
                return aost.NONE;
            case 11:
                return aost.NONE;
            case 12:
                return null;
            case 13:
                return null;
            case 14:
                return agpi.a;
            case 15:
                return Boolean.FALSE;
            case 16:
                return null;
            case 17:
                return Boolean.FALSE;
            case 18:
                return null;
            case 19:
                return Boolean.FALSE;
            default:
                return null;
        }
        return arrayList;
    }
}
