package org.itstack.demo.rpc.network.server;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;
import org.itstack.demo.rpc.network.msg.Request;
import org.itstack.demo.rpc.network.msg.Response;

import java.time.LocalDateTime;

/**
 * http://www.itstack.org
 * create by fuzhengwei on 2019/5/6
 */
public class MyServerHandler extends ChannelInboundHandlerAdapter{

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object obj){
        Request msg = (Request) obj;
        //反馈
        Response response = new Response();
        response.setRequestId(msg.getRequestId());
        response.setResult(msg.getParam() + " 请求成功，反馈结果请接受处理。" + LocalDateTime.now());
        ctx.writeAndFlush(response);
        //释放： 假设obj实现了ReferenceCounted接口
        ReferenceCountUtil.release(msg);
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) {
        ctx.flush();
    }

}
