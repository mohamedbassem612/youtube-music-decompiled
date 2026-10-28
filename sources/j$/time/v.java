package j$.time;

import j$.time.zone.ZoneRules;
import j$.util.Objects;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class v extends ZoneId {
    public static final /* synthetic */ int d = 0;
    private static final long serialVersionUID = 8386373296231747096L;
    public final String b;
    public final transient ZoneRules c;

    public v(String str, ZoneRules zoneRules) {
        this.b = str;
        this.c = zoneRules;
    }

    public static v I(String str, boolean z) {
        Objects.a(str, "zoneId");
        int length = str.length();
        ZoneRules zoneRulesA = null;
        if (length < 2) {
            g.g("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
            return null;
        }
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt != '/' || i == 0) && ((cCharAt < '0' || cCharAt > '9' || i == 0) && ((cCharAt != '~' || i == 0) && ((cCharAt != '.' || i == 0) && ((cCharAt != '_' || i == 0) && ((cCharAt != '+' || i == 0) && (cCharAt != '-' || i == 0))))))))) {
                g.g("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
                return null;
            }
        }
        try {
            zoneRulesA = j$.time.zone.f.a(str);
        } catch (j$.time.zone.e e) {
            if (z) {
                throw e;
            }
        }
        return new v(str, zoneRulesA);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new q((byte) 7, this);
    }

    @Override // j$.time.ZoneId
    public final void H(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(7);
        objectOutput.writeUTF(this.b);
    }

    @Override // j$.time.ZoneId
    public final String getId() {
        return this.b;
    }

    @Override // j$.time.ZoneId
    public final ZoneRules getRules() {
        ZoneRules zoneRules = this.c;
        return zoneRules == null ? j$.time.zone.f.a(this.b) : zoneRules;
    }
}
