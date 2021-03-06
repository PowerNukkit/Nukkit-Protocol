package com.nukkitx.protocol.bedrock.v291.serializer;

import com.nukkitx.network.VarInts;
import com.nukkitx.protocol.bedrock.BedrockPacketHelper;
import com.nukkitx.protocol.bedrock.BedrockPacketSerializer;
import com.nukkitx.protocol.bedrock.packet.RemoveEntityPacket;
import io.netty.buffer.ByteBuf;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RemoveEntitySerializer_v291 implements BedrockPacketSerializer<RemoveEntityPacket> {
    public static final RemoveEntitySerializer_v291 INSTANCE = new RemoveEntitySerializer_v291();


    @Override
    public void serialize(ByteBuf buffer, BedrockPacketHelper helper, RemoveEntityPacket packet) {
        VarInts.writeLong(buffer, packet.getUniqueEntityId());
    }

    @Override
    public void deserialize(ByteBuf buffer, BedrockPacketHelper helper, RemoveEntityPacket packet) {
        packet.setUniqueEntityId(VarInts.readLong(buffer));
    }
}
