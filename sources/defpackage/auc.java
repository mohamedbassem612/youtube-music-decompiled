package defpackage;

import android.app.Notification;
import android.app.Person;
import android.graphics.Shader;
import android.media.AudioDescriptor;
import android.os.Build;
import android.os.Bundle;
import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class auc {
    static Notification.MessagingStyle.Message a(CharSequence charSequence, long j, Person person) {
        return new Notification.MessagingStyle.Message(charSequence, j, person);
    }

    static void b(Notification.MessagingStyle.Message message, Bundle bundle) {
        message.getExtras().putAll(bundle);
    }

    public static Shader.TileMode c(int i) {
        if (i != 1) {
            return i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }

    public static boolean d(int i) {
        if (i == 8 || i == 7) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 31 || !(i == 26 || i == 27)) {
            return Build.VERSION.SDK_INT >= 33 && i == 30;
        }
        return true;
    }

    public static agke e(List list) {
        if (Build.VERSION.SDK_INT < 31 || list == null) {
            return agpi.a;
        }
        TreeSet treeSet = new TreeSet(Comparator$EL.reversed(Comparator$CC.comparing(new bwa(3))));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioDescriptor audioDescriptorM649m = br$$ExternalSyntheticApiModelOutline0.m649m(it.next());
            if (audioDescriptorM649m.getStandard() == 1) {
                byte[] descriptor = audioDescriptorM649m.getDescriptor();
                int length = descriptor.length;
                if (length != 3) {
                    bvx.e("AudioDescriptorUtil", a.bR(length, "Invalid SAD length: "));
                } else {
                    byte b = descriptor[0];
                    int i = (b & 7) + 1;
                    if (((b >> 3) & 15) == 1) {
                        treeSet.add(Integer.valueOf(bwp.g(i)));
                    }
                }
            }
        }
        return agke.n(treeSet);
    }
}
