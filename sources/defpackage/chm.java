package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class chm {
    public static final agke a = agke.q(12);

    public static agke a(AudioDeviceInfo audioDeviceInfo) {
        List audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator$EL.reversed(Comparator$CC.comparing(new bwa(4))));
        Iterator it = audioProfiles.iterator();
        while (it.hasNext()) {
            AudioProfile audioProfileM650m = br$$ExternalSyntheticApiModelOutline0.m650m(it.next());
            if (audioProfileM650m.getEncapsulationType() != 1 && bwp.ab(audioProfileM650m.getFormat())) {
                for (int i : audioProfileM650m.getChannelMasks()) {
                    treeSet.add(Integer.valueOf(i));
                }
            }
        }
        return agke.n(treeSet);
    }
}
