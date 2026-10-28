package defpackage;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.text.TextUtils;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cki implements ckd {
    public final MediaDrm a;
    private final UUID b;
    private int c;

    private cki(UUID uuid) {
        uuid.getClass();
        ahno.G(!brt.b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.b = uuid;
        MediaDrm mediaDrm = new MediaDrm(s(uuid));
        this.a = mediaDrm;
        this.c = 1;
        if (brt.d.equals(uuid)) {
            int i = bst.a;
            if ("ASUS_Z00AD".equals(Build.MODEL)) {
                mediaDrm.setPropertyString("securityLevel", "L3");
            }
        }
    }

    public static cki r(UUID uuid) throws cko {
        try {
            return new cki(uuid);
        } catch (UnsupportedSchemeException e) {
            throw new cko(1, e);
        } catch (Exception e2) {
            throw new cko(2, e2);
        }
    }

    private static UUID s(UUID uuid) {
        return t(uuid) ? brt.b : uuid;
    }

    private static boolean t(UUID uuid) {
        return Build.VERSION.SDK_INT < 27 && Objects.equals(uuid, brt.c);
    }

    @Override // defpackage.ckd
    public final int a() {
        return 2;
    }

    @Override // defpackage.ckd
    public final String c(String str) {
        return this.a.getPropertyString(str);
    }

    @Override // defpackage.ckd
    public final Map d(byte[] bArr) {
        return this.a.queryKeyStatus(bArr);
    }

    @Override // defpackage.ckd
    public final void e(byte[] bArr) {
        this.a.closeSession(bArr);
    }

    @Override // defpackage.ckd
    public final void f(byte[] bArr) throws DeniedByServerException {
        this.a.provideProvisionResponse(bArr);
    }

    @Override // defpackage.ckd
    public final synchronized void g() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            this.a.release();
        }
    }

    @Override // defpackage.ckd
    public final void h(byte[] bArr, byte[] bArr2) {
        this.a.restoreKeys(bArr, bArr2);
    }

    @Override // defpackage.ckd
    public final void i(final ckc ckcVar) {
        this.a.setOnEventListener(new MediaDrm.OnEventListener() { // from class: ckg
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                ckcVar.a(bArr, i);
            }
        });
    }

    @Override // defpackage.ckd
    public final void j(byte[] bArr, cfd cfdVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                MediaDrm mediaDrm = this.a;
                LogSessionId logSessionIdA = cfdVar.a();
                if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                    return;
                }
                MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
                playbackComponent.getClass();
                playbackComponent.setLogSessionId(logSessionIdA);
            } catch (UnsupportedOperationException unused) {
                bvx.e("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // defpackage.ckd
    public final void k(String str, String str2) {
        this.a.setPropertyString(str, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r0.startsWith("16.0") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (r0.equals(defpackage.brt.c) != false) goto L19;
     */
    @Override // defpackage.ckd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(byte[] r4, java.lang.String r5) throws java.lang.Throwable {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L50
            java.util.UUID r0 = r3.b
            java.util.UUID r1 = defpackage.brt.d
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L3d
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 37
            if (r0 >= r1) goto L45
            java.lang.String r0 = "version"
            java.lang.String r0 = r3.c(r0)
            java.lang.String r1 = "v5."
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L50
            java.lang.String r1 = "14."
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L50
            java.lang.String r1 = "15."
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L50
            java.lang.String r1 = "16.0"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L45
            goto L50
        L3d:
            java.util.UUID r1 = defpackage.brt.c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L50
        L45:
            android.media.MediaDrm r3 = r3.a
            int r4 = defpackage.fd$$ExternalSyntheticApiModelOutline0.m(r3, r4)
            boolean r3 = defpackage.qa$$ExternalSyntheticApiModelOutline0.m(r3, r5, r4)
            goto L77
        L50:
            r0 = 0
            android.media.MediaCrypto r1 = new android.media.MediaCrypto     // Catch: android.media.MediaCryptoException -> L68 java.lang.Throwable -> L78
            java.util.UUID r2 = r3.b     // Catch: android.media.MediaCryptoException -> L68 java.lang.Throwable -> L78
            java.util.UUID r2 = s(r2)     // Catch: android.media.MediaCryptoException -> L68 java.lang.Throwable -> L78
            r1.<init>(r2, r4)     // Catch: android.media.MediaCryptoException -> L68 java.lang.Throwable -> L78
            boolean r3 = r1.requiresSecureDecoderComponent(r5)     // Catch: java.lang.Throwable -> L64 android.media.MediaCryptoException -> L67
            r1.release()
            goto L77
        L64:
            r3 = move-exception
            r0 = r1
            goto L79
        L67:
            r0 = r1
        L68:
            java.util.UUID r3 = r3.b     // Catch: java.lang.Throwable -> L78
            java.util.UUID r4 = defpackage.brt.c     // Catch: java.lang.Throwable -> L78
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L78
            r3 = r3 ^ 1
            if (r0 == 0) goto L77
            r0.release()
        L77:
            return r3
        L78:
            r3 = move-exception
        L79:
            if (r0 == 0) goto L7e
            r0.release()
        L7e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cki.l(byte[], java.lang.String):boolean");
    }

    @Override // defpackage.ckd
    public final byte[] m() {
        return this.a.openSession();
    }

    @Override // defpackage.ckd
    public final byte[] n(byte[] bArr, byte[] bArr2) {
        if (brt.c.equals(this.b) && Build.VERSION.SDK_INT < 27) {
            try {
                JSONObject jSONObject = new JSONObject(bwp.L(bArr2));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                int i = 0;
                while (i < jSONArray.length()) {
                    if (i != 0) {
                        sb.append(',');
                    } else {
                        i = 0;
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    sb.append("{\"k\":\"");
                    sb.append(aun.n(jSONObject2.getString("k")));
                    sb.append("\",\"kid\":\"");
                    sb.append(aun.n(jSONObject2.getString("kid")));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                    i++;
                }
                sb.append("]}");
                bArr2 = bwp.ah(sb.toString());
            } catch (JSONException e) {
                bvx.d("ClearKeyUtil", "Failed to adjust response data: ".concat(bwp.L(bArr2)), e);
            }
        }
        return this.a.provideKeyResponse(bArr, bArr2);
    }

    @Override // defpackage.ckd
    public final eol o() {
        MediaDrm.ProvisionRequest provisionRequest = this.a.getProvisionRequest();
        return new eol(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a1 A[LOOP:2: B:27:0x0088->B:32:0x00a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x020e  */
    @Override // defpackage.ckd
    public final eol p(byte[] bArr, List list, int i, HashMap map) throws NotProvisionedException {
        brz brzVar;
        byte[] bArr2;
        String str;
        int i2;
        brz brzVar2;
        byte[] bArr3;
        byte[] bArrK;
        yvh yvhVarM;
        if (list != null) {
            UUID uuid = this.b;
            if (!brt.d.equals(uuid)) {
                brzVar = (brz) list.get(0);
            } else if (Build.VERSION.SDK_INT < 28 || list.size() <= 1) {
                i2 = 0;
                while (true) {
                    if (i2 < list.size()) {
                        brzVar = (brz) list.get(0);
                        break;
                    }
                    brzVar2 = (brz) list.get(i2);
                    bArr3 = brzVar2.d;
                    bArr3.getClass();
                    if (om.h(bArr3) == 1) {
                        brzVar = brzVar2;
                        break;
                    }
                    i2++;
                }
            } else {
                brz brzVar3 = (brz) list.get(0);
                int i3 = 0;
                int length = 0;
                while (true) {
                    if (i3 < list.size()) {
                        brz brzVar4 = (brz) list.get(i3);
                        byte[] bArr4 = brzVar4.d;
                        bArr4.getClass();
                        if (Objects.equals(brzVar4.c, brzVar3.c) && Objects.equals(brzVar4.b, brzVar3.b) && om.m(bArr4) != null) {
                            length += bArr4.length;
                            i3++;
                        } else {
                            i2 = 0;
                            while (true) {
                                if (i2 < list.size()) {
                                    brzVar = (brz) list.get(0);
                                    break;
                                }
                                brzVar2 = (brz) list.get(i2);
                                bArr3 = brzVar2.d;
                                bArr3.getClass();
                                if (om.h(bArr3) == 1) {
                                    brzVar = brzVar2;
                                    break;
                                }
                                i2++;
                            }
                        }
                    } else {
                        byte[] bArr5 = new byte[length];
                        int i4 = 0;
                        for (int i5 = 0; i5 < list.size(); i5++) {
                            byte[] bArr6 = ((brz) list.get(i5)).d;
                            bArr6.getClass();
                            int length2 = bArr6.length;
                            System.arraycopy(bArr6, 0, bArr5, i4, length2);
                            i4 += length2;
                        }
                        brzVar = new brz(brzVar3.a, brzVar3.b, brzVar3.c, bArr5);
                    }
                }
            }
            byte[] bArrJ = brzVar.d;
            bArrJ.getClass();
            UUID uuid2 = brt.e;
            if (uuid2.equals(uuid)) {
                byte[] bArrK2 = om.k(bArrJ, uuid);
                if (bArrK2 != null) {
                    bArrJ = bArrK2;
                }
                bwb bwbVar = new bwb(bArrJ);
                int iJ = bwbVar.j();
                short sF = bwbVar.F();
                short sF2 = bwbVar.F();
                if (sF == 1 && sF2 == 1) {
                    String strD = bwbVar.D(bwbVar.F(), StandardCharsets.UTF_16LE);
                    if (!strD.contains("<LA_URL>")) {
                        int iIndexOf = strD.indexOf("</DATA>");
                        if (iIndexOf == -1) {
                            bvx.e("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
                            iIndexOf = -1;
                        }
                        String str2 = strD.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strD.substring(iIndexOf);
                        int i6 = iJ + 52;
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i6);
                        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                        byteBufferAllocate.putInt(i6);
                        byteBufferAllocate.putShort((short) 1);
                        byteBufferAllocate.putShort((short) 1);
                        byteBufferAllocate.putShort((short) (str2.length() << 1));
                        byteBufferAllocate.put(str2.getBytes(StandardCharsets.UTF_16LE));
                        bArrJ = byteBufferAllocate.array();
                    }
                } else {
                    bvx.h("Unexpected record count or type. Skipping LA_URL workaround.");
                }
                bArrJ = om.j(uuid2, null, bArrJ);
            }
            if (t(uuid) && (yvhVarM = om.m(bArrJ)) != null) {
                bArrJ = om.j(brt.b, (UUID[]) yvhVarM.d, (byte[]) yvhVarM.b);
            }
            int i7 = bst.a;
            if (uuid2.equals(uuid) && "Amazon".equals(Build.MANUFACTURER) && (("AFTB".equals(Build.MODEL) || "AFTS".equals(Build.MODEL) || "AFTM".equals(Build.MODEL) || "AFTT".equals(Build.MODEL)) && (bArrK = om.k(bArrJ, uuid)) != null)) {
                bArrJ = bArrK;
            }
            str = brzVar.c;
            bArr2 = bArrJ;
        } else {
            brzVar = null;
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.a.getKeyRequest(bArr, bArr2, str, i, map);
        UUID uuid3 = this.b;
        byte[] data = keyRequest.getData();
        if (brt.c.equals(uuid3) && Build.VERSION.SDK_INT < 27) {
            data = bwp.ah(bwp.L(data).replace('+', '-').replace('/', '_'));
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("<LA_URL>https://x</LA_URL>".equals(defaultUrl)) {
            defaultUrl = "";
        } else if (Build.VERSION.SDK_INT >= 33 && "https://default.url".equals(defaultUrl)) {
            String strC = c("version");
            if (Objects.equals(strC, "1.2") || Objects.equals(strC, "aidl-1")) {
                defaultUrl = "";
            }
        }
        if (TextUtils.isEmpty(defaultUrl) && brzVar != null) {
            String str3 = brzVar.b;
            if (!TextUtils.isEmpty(str3)) {
                defaultUrl = str3;
            }
        }
        keyRequest.getRequestType();
        return new eol(data, defaultUrl, (byte[]) null);
    }

    @Override // defpackage.ckd
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final cke b(byte[] bArr) {
        return new cke(s(this.b), bArr);
    }
}
