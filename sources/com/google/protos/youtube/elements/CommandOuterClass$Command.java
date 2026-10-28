package com.google.protos.youtube.elements;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihh;
import defpackage.aihi;
import defpackage.aihj;
import defpackage.aihm;
import defpackage.aihn;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class CommandOuterClass$Command extends aihi implements aihj {
    public static final CommandOuterClass$Command a;
    private byte b = 2;

    static {
        CommandOuterClass$Command commandOuterClass$Command = new CommandOuterClass$Command();
        a = commandOuterClass$Command;
        aihn.registerDefaultInstance(CommandOuterClass$Command.class, commandOuterClass$Command);
    }

    private CommandOuterClass$Command() {
    }

    public static CommandOuterClass$Command getDefaultInstance() {
        return a;
    }

    public static CommandOuterClass$Command parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (CommandOuterClass$Command) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.b);
            case 1:
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new CommandOuterClass$Command();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(CommandOuterClass$Command.class);
            default:
                return null;
        }
    }
}
