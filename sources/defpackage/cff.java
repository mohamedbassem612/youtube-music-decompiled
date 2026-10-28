package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDescriptor;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.os.Build;
import android.provider.Settings;
import android.util.SparseArray;
import app.rive.semantics.SemanticState;
import j$.util.Map;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cff {
    public static final cff a;
    static final agkj b;
    private static final agke e;
    private static final agke f;
    private static final agke g;
    public final agke c;
    public final agke d;
    private final SparseArray h = new SparseArray();
    private final int i;

    static {
        agke agkeVarQ = agke.q(12);
        e = agkeVarQ;
        agke agkeVar = agpi.a;
        f = agkeVar;
        a = new cff(agke.q(cfe.a), agkeVarQ, agkeVar);
        g = agke.s(2, 5, 6);
        agkh agkhVar = new agkh(4);
        agkhVar.e(5, 6);
        agkhVar.e(17, 6);
        agkhVar.e(7, 6);
        agkhVar.e(30, 10);
        agkhVar.e(18, 6);
        agkhVar.e(6, 8);
        agkhVar.e(8, 8);
        agkhVar.e(14, 8);
        b = agkhVar.d(true);
    }

    public cff(List list, List list2, List list3) {
        for (int i = 0; i < ((agpi) list).d; i++) {
            cfe cfeVar = (cfe) list.get(i);
            this.h.put(cfeVar.b, cfeVar);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            iMax = Math.max(iMax, ((cfe) this.h.valueAt(i2)).c);
        }
        this.i = iMax;
        this.c = agke.n(list2);
        this.d = agke.n(list3);
    }

    static cff b(Context context, brq brqVar, AudioDeviceInfo audioDeviceInfo, List list) {
        return c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), brqVar, audioDeviceInfo, list);
    }

    /* JADX WARN: Code duplicated, block: B:127:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:138:0x01e4  */
    static cff c(Context context, Intent intent, brq brqVar, AudioDeviceInfo audioDeviceInfo, List list) {
        AudioDeviceInfo audioDeviceInfo2;
        int i;
        agke agkeVarA;
        AudioDeviceInfo[] devices;
        cff cffVar;
        int type;
        agke agkeVarN;
        int i2;
        int i3;
        int speakerLayoutChannelMask;
        AudioManager audioManagerO = ast.o(context);
        int i4 = 0;
        if (audioDeviceInfo == null) {
            audioDeviceInfo2 = null;
            if (Build.VERSION.SDK_INT >= 33) {
                try {
                    List audioDevicesForAttributes = audioManagerO.getAudioDevicesForAttributes(brqVar.a());
                    if (!audioDevicesForAttributes.isEmpty()) {
                        audioDeviceInfo2 = (AudioDeviceInfo) audioDevicesForAttributes.get(0);
                    }
                } catch (RuntimeException unused) {
                }
            }
        } else {
            audioDeviceInfo2 = audioDeviceInfo;
        }
        int i5 = 2;
        if (audioDeviceInfo2 != null) {
            agke agkeVar = chm.a;
            if (auc.d(audioDeviceInfo2.getType())) {
                agkeVarA = chm.a;
            } else if (audioDeviceInfo2.getType() == 1) {
                agkeVarA = agke.q(4);
            } else {
                int type2 = audioDeviceInfo2.getType();
                int i6 = Build.VERSION.SDK_INT;
                if (type2 == 2) {
                    if (i6 < 36 || (speakerLayoutChannelMask = audioDeviceInfo2.getSpeakerLayoutChannelMask()) == 0 || speakerLayoutChannelMask == 1) {
                        bvx.e("SpeakerLayoutUtil", "Built-in speaker's getSpeakerLayoutChannelMask not usable, defaulting to stereo.");
                        agkeVarA = chm.a;
                    } else {
                        agkeVarA = agke.q(Integer.valueOf(speakerLayoutChannelMask));
                    }
                } else if (i6 >= 31 && audioDeviceInfo2.getType() == 10) {
                    agkeVarA = chm.a(audioDeviceInfo2);
                    if (agkeVarA.isEmpty()) {
                        agkeVarA = auc.e(audioDeviceInfo2.getAudioDescriptors());
                        if (agkeVarA.isEmpty()) {
                            agkeVarA = chm.a;
                        }
                    }
                } else if (Build.VERSION.SDK_INT >= 31) {
                    int type3 = audioDeviceInfo2.getType();
                    if (Build.VERSION.SDK_INT < 31 || type3 != 29) {
                        i = 0;
                        if (Build.VERSION.SDK_INT >= 31 || !((type = audioDeviceInfo2.getType()) == 11 || type == 12 || (Build.VERSION.SDK_INT >= 31 && type == 22))) {
                            agkeVarA = chm.a;
                        } else {
                            agkeVarA = chm.a(audioDeviceInfo2);
                            if (agkeVarA.isEmpty()) {
                                agkeVarA = chm.a;
                            }
                        }
                    } else {
                        agkeVarA = chm.a(audioDeviceInfo2);
                        if (agkeVarA.isEmpty()) {
                            List audioDescriptors = audioDeviceInfo2.getAudioDescriptors();
                            if (Build.VERSION.SDK_INT >= 34) {
                                if (Build.VERSION.SDK_INT < 34 || audioDescriptors == null) {
                                    i = 0;
                                    agkeVarN = agpi.a;
                                } else {
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it = audioDescriptors.iterator();
                                    while (true) {
                                        i = i4;
                                        i2 = 3;
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        AudioDescriptor audioDescriptorM649m = br$$ExternalSyntheticApiModelOutline0.m649m(it.next());
                                        if (audioDescriptorM649m.getStandard() == 2) {
                                            byte[] descriptor = audioDescriptorM649m.getDescriptor();
                                            int length = descriptor.length;
                                            if (length != 3) {
                                                bvx.e("AudioDescriptorUtil", "Invalid SADB length: " + length);
                                            } else {
                                                if (Build.VERSION.SDK_INT >= 34) {
                                                    byte b2 = descriptor[i];
                                                    i3 = 1 != (b2 & 1) ? i : 12;
                                                    if ((b2 & 2) != 0) {
                                                        i3 |= 32;
                                                    }
                                                    if ((b2 & 4) != 0) {
                                                        i3 |= 16;
                                                    }
                                                    if ((b2 & 8) != 0) {
                                                        i3 |= 192;
                                                    }
                                                    if ((b2 & 16) != 0) {
                                                        i3 |= SemanticState.ReadOnly;
                                                    }
                                                    if ((b2 & 32) != 0) {
                                                        i3 |= 768;
                                                    }
                                                    if ((b2 & 128) != 0) {
                                                        i3 |= 201326592;
                                                    }
                                                    byte b3 = descriptor[1];
                                                    if ((b3 & 1) != 0) {
                                                        i3 |= 81920;
                                                    }
                                                    if ((b3 & 2) != 0) {
                                                        i3 |= SemanticState.Multiline;
                                                    }
                                                    if ((b3 & 4) != 0) {
                                                        i3 |= 32768;
                                                    }
                                                    if ((b3 & 8) != 0) {
                                                        i3 |= 6144;
                                                    }
                                                    if ((b3 & 16) != 0) {
                                                        i3 |= 33554432;
                                                    }
                                                    if ((b3 & 32) != 0) {
                                                        i3 |= 262144;
                                                    }
                                                    if ((b3 & 64) != 0) {
                                                        i3 |= 6144;
                                                    }
                                                    if ((b3 & 128) != 0) {
                                                        i3 |= 3145728;
                                                    }
                                                    byte b4 = descriptor[2];
                                                    if ((b4 & 1) != 0) {
                                                        i3 |= 655360;
                                                    }
                                                    if ((b4 & 2) != 0) {
                                                        i3 |= 8388608;
                                                    }
                                                    if ((b4 & 4) != 0) {
                                                        i3 |= 20971520;
                                                    }
                                                } else {
                                                    i3 = i;
                                                }
                                                arrayList.add(Integer.valueOf(i3));
                                            }
                                        }
                                        i4 = i;
                                    }
                                    j$.util.List.EL.sort(arrayList, new awv(i2));
                                    agkeVarN = agke.n(arrayList);
                                }
                                if (!agkeVarN.isEmpty()) {
                                    agkeVarA = agkeVarN;
                                }
                            } else {
                                i = 0;
                            }
                            agkeVarA = auc.e(audioDescriptors);
                            if (agkeVarA.isEmpty()) {
                                agkeVarA = chm.a;
                            }
                        }
                    }
                } else {
                    i = 0;
                    if (Build.VERSION.SDK_INT >= 31) {
                        agkeVarA = chm.a;
                    } else {
                        agkeVarA = chm.a;
                    }
                }
            }
            i = 0;
        } else {
            i = 0;
            agkeVarA = e;
        }
        if (Build.VERSION.SDK_INT >= 33 && (bwp.ae(context) || bwp.aa(context))) {
            List directProfilesForAttributes = audioManagerO.getDirectProfilesForAttributes(brqVar.a());
            HashMap map = new HashMap();
            map.put(2, new HashSet(ahng.Q(12)));
            for (int i7 = i; i7 < directProfilesForAttributes.size(); i7++) {
                AudioProfile audioProfileM650m = br$$ExternalSyntheticApiModelOutline0.m650m(directProfilesForAttributes.get(i7));
                if (audioProfileM650m.getEncapsulationType() != 1) {
                    int format = audioProfileM650m.getFormat();
                    if (bwp.ab(format) || b.containsKey(Integer.valueOf(format))) {
                        ((Set) Map.EL.computeIfAbsent(map, Integer.valueOf(format), new bwa(i5))).addAll(ahng.Q(audioProfileM650m.getChannelMasks()));
                    }
                }
            }
            agjz agjzVar = new agjz(4);
            for (java.util.Map.Entry entry : map.entrySet()) {
                agjzVar.h(new cfe(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
            }
            return new cff(agjzVar.g(), agkeVarA, list);
        }
        if (audioDeviceInfo2 == null) {
            devices = audioManagerO.getDevices(2);
        } else {
            devices = new AudioDeviceInfo[1];
            devices[i] = audioDeviceInfo2;
        }
        int length2 = devices.length;
        for (int i8 = i; i8 < length2; i8++) {
            if (auc.d(devices[i8].getType())) {
                return new cff(agke.q(cfe.a), agkeVarA, list);
            }
        }
        agkx agkxVar = new agkx();
        agkxVar.c(2);
        if (Build.VERSION.SDK_INT < 29 || !(bwp.ae(context) || bwp.aa(context))) {
            ContentResolver contentResolver = context.getContentResolver();
            int i9 = i;
            int i10 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", i9) == 1 ? 1 : i9;
            if ((i10 != 0 || d()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", i9) == 1) {
                agkxVar.j(g);
            }
            if (intent != null && i10 == 0 && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", i9) == 1) {
                int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
                if (intArrayExtra != null) {
                    agkxVar.j(ahng.Q(intArrayExtra));
                }
                return new cff(f(ahng.S(agkxVar.g()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)), agkeVarA, list);
            }
            cffVar = new cff(f(ahng.S(agkxVar.g()), 10), agkeVarA, list);
        } else {
            agjz agjzVar2 = new agjz(4);
            agqr it2 = b.keySet().iterator();
            while (it2.hasNext()) {
                Integer num = (Integer) it2.next();
                int iIntValue = num.intValue();
                if (Build.VERSION.SDK_INT >= bwp.f(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), brqVar.a())) {
                    agjzVar2.h(num);
                }
            }
            agjzVar2.h(2);
            agkxVar.j(agjzVar2.g());
            cffVar = new cff(f(ahng.S(agkxVar.g()), 10), agkeVarA, list);
        }
        return cffVar;
    }

    public static boolean d() {
        return Build.MANUFACTURER.equals("Amazon") || Build.MANUFACTURER.equals("Xiaomi");
    }

    private static agke f(int[] iArr, int i) {
        agjz agjzVar = new agjz(4);
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            agjzVar.h(new cfe(i2, i));
        }
        return agjzVar.g();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    /* JADX WARN: Code duplicated, block: B:14:0x0031 A[PHI: r1
      0x0031: PHI (r1v3 int) = (r1v2 int), (r1v6 int) binds: [B:10:0x0028, B:13:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    /* JADX WARN: Code duplicated, block: B:18:0x003b  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f5  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        if (r7 <= 10) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
    
        if (r7 <= r12.c) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0082, code lost:
    
        if (r14.contains(java.lang.Integer.valueOf(r12)) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0084, code lost:
    
        r12 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair a(defpackage.bse r13, defpackage.brq r14) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cff.a(bse, brq):android.util.Pair");
    }

    public final boolean e(int i) {
        return bwp.X(this.h, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cff) {
            cff cffVar = (cff) obj;
            SparseArray sparseArray = this.h;
            SparseArray sparseArray2 = cffVar.h;
            int i = bwp.a;
            if (Build.VERSION.SDK_INT < 31) {
                int size = sparseArray.size();
                if (size == sparseArray2.size()) {
                    for (int i2 = 0; i2 < size; i2++) {
                        if (Objects.equals(sparseArray.valueAt(i2), sparseArray2.get(sparseArray.keyAt(i2)))) {
                        }
                    }
                    if (this.i == cffVar.i) {
                        return true;
                    }
                }
            } else if (sparseArray.contentEquals(sparseArray2)) {
                if (this.i == cffVar.i && Objects.equals(this.c, cffVar.c) && Objects.equals(this.d, cffVar.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iContentHashCode;
        int i = bwp.a;
        int i2 = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.h;
        if (i2 >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iKeyAt = 17;
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                iKeyAt = (((iKeyAt * 31) + sparseArray.keyAt(i3)) * 31) + Objects.hashCode(sparseArray.valueAt(i3));
            }
            iContentHashCode = iKeyAt;
        }
        return (((((this.i * 31) + iContentHashCode) * 31) + Objects.hashCode(this.c)) * 31) + Objects.hashCode(this.d);
    }

    public final String toString() {
        agke agkeVar = this.d;
        agke agkeVar2 = this.c;
        return "AudioCapabilities[maxChannelCount=" + this.i + ", audioProfiles=" + this.h.toString() + ", speakerLayoutChannelMasks=" + String.valueOf(agkeVar2) + ", spatializerChannelMasks=" + String.valueOf(agkeVar) + ']';
    }
}
