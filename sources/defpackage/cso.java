package defpackage;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.PowerManager;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cso {
    private final Object a;
    private Object b;

    public cso(byte[] bArr) {
        this.a = new HashMap();
        this.b = caw.a;
    }

    private final void l() {
        ByteBuffer byteBuffer = (ByteBuffer) this.a;
        byteBuffer.position(byteBuffer.limit());
    }

    private final void m(List list) {
        bxh bxhVar;
        for (int i = 0; i < list.size(); i++) {
            if (((aami) list.get(i)).a == 1) {
                try {
                    bxhVar = new bxh((aami) list.get(i));
                } catch (bxg unused) {
                    bxhVar = null;
                }
                this.b = bxhVar;
            }
        }
    }

    private static final caw n(caw cawVar, List list) {
        Map map = cawVar.b;
        HashMap map2 = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                map2.remove(str);
            }
        }
        return new caw(map2);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    /* JADX WARN: Code duplicated, block: B:45:0x006a A[ADDED_TO_REGION, EDGE_INSN: B:45:0x006a->B:30:0x006a BREAK  A[LOOP:0: B:6:0x0022->B:29:0x0067], REMOVE, SYNTHETIC] */
    public final int a(ByteBuffer byteBuffer, boolean z) {
        Object obj;
        acih acihVar;
        ByteBuffer byteBuffer2 = (ByteBuffer) this.a;
        if (byteBuffer2.hasRemaining()) {
            m(atz.g(byteBuffer2));
            l();
        }
        List listG = atz.g(byteBuffer);
        m(listG);
        int size = listG.size() - 1;
        int i = 0;
        while (size >= 0) {
            aami aamiVar = (aami) listG.get(size);
            int i2 = aamiVar.a;
            if (i2 != 2 && i2 != 15) {
                if (i2 == 3) {
                    if (!z) {
                        break;
                    }
                    i2 = 3;
                    if (i2 != 6) {
                        acihVar = new acih((bxh) obj, aamiVar);
                        if (acihVar != null) {
                            break;
                            break;
                        }
                        break;
                        break;
                    }
                    acihVar = new acih((bxh) obj, aamiVar);
                    if (acihVar != null) {
                        break;
                    }
                    break;
                    break;
                }
                if ((i2 != 6 && i2 != 3) || (obj = this.b) == null) {
                    break;
                }
                try {
                    acihVar = new acih((bxh) obj, aamiVar);
                } catch (bxg unused) {
                    acihVar = null;
                }
                if (acihVar != null || acihVar.a) {
                    break;
                }
            }
            if (((aami) listG.get(size)).a == 6 || ((aami) listG.get(size)).a == 3) {
                i++;
            }
            size--;
        }
        if (i > 1 || size + 1 >= 8) {
            return byteBuffer.limit();
        }
        return size >= 0 ? ((ByteBuffer) ((aami) listG.get(size)).b).limit() : byteBuffer.position();
    }

    public final void b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, iPosition + 500));
        ByteBuffer byteBuffer2 = (ByteBuffer) this.a;
        byteBuffer2.clear();
        byteBuffer2.put(byteBuffer);
        byteBuffer2.flip();
        byteBuffer.position(iPosition);
        byteBuffer.limit(iLimit);
    }

    public final void c() {
        this.b = null;
        l();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final void d(caw cawVar) {
        for (Map.Entry entry : new HashMap((Map) this.a).entrySet()) {
            cax caxVar = (cax) entry.getKey();
            List list = (List) entry.getValue();
            if (!n(cawVar, list).equals(n((caw) this.b, list))) {
                caxVar.a();
            }
        }
        this.b = cawVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    public final synchronized Map e() {
        if (this.b == null) {
            this.b = DesugarCollections.unmodifiableMap(new HashMap((Map) this.a));
        }
        return this.b;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    public final synchronized void f() {
        this.b = null;
        this.a.clear();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final synchronized void g(String str, String str2) {
        this.b = null;
        this.a.put(str, str2);
    }

    public final synchronized void h(AtomicBoolean atomicBoolean) {
        Object obj;
        if (atomicBoolean.get() && (obj = this.b) != null) {
            ((WifiManager.WifiLock) obj).release();
        }
    }

    public final void i(boolean z, boolean z2) {
        if (z && this.b == null) {
            Context context = (Context) this.a;
            if (context.checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                bvx.e("WifiLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                return;
            }
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            if (wifiManager == null) {
                bvx.e("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.b = wifiLockCreateWifiLock;
                wifiLockCreateWifiLock.setReferenceCounted(false);
            }
        }
        Object obj = this.b;
        if (obj != null) {
            if (bwt.c(z, z2)) {
                ((WifiManager.WifiLock) obj).acquire();
            } else {
                ((WifiManager.WifiLock) obj).release();
            }
        }
    }

    public final synchronized void j(AtomicBoolean atomicBoolean) {
        Object obj;
        if (atomicBoolean.get() && (obj = this.b) != null) {
            ((PowerManager.WakeLock) obj).release();
        }
    }

    public final synchronized void k(boolean z, boolean z2) {
        if (z) {
            if (this.b == null) {
                Object obj = this.a;
                if (((Context) obj).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                    bvx.e("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                    return;
                }
                PowerManager powerManager = (PowerManager) ((Context) obj).getSystemService("power");
                if (powerManager == null) {
                    bvx.e("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                    return;
                }
                PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.b = wakeLockNewWakeLock;
                PowerManager.WakeLock wakeLock = wakeLockNewWakeLock;
                wakeLockNewWakeLock.setReferenceCounted(false);
            }
        }
        Object obj2 = this.b;
        if (obj2 == null) {
            return;
        }
        if (bwq.c(z, z2)) {
            ((PowerManager.WakeLock) obj2).acquire();
        } else {
            ((PowerManager.WakeLock) obj2).release();
        }
    }

    public cso(char[] cArr) {
        this.a = new HashMap();
    }

    public cso(Context context) {
        this.a = context;
    }

    public cso() {
        this.a = ByteBuffer.allocateDirect(500);
    }
}
